package com.yap.core.base

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.yap.core.R
import com.yap.core.base.interfaces.IBase
import com.yap.core.extensions.toast


/**
Created by Faheem Riaz on 02/08/2021.
 **/

abstract class BaseActivity<VB : ViewDataBinding, VS : IBase.State, VM : IBase.ViewModel<VS>> :
    IBase.View<VM>,
    AppCompatActivity() {
    lateinit var mViewBinding: VB
    private var progress: Dialog? = null

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getBindingVariable(): Int

    /**
     * Gets called right before the UI initialization.
     */
    protected open fun preInit(savedInstanceState: Bundle?) {
        //
    }

    /**
     * Get's called when it's the right time for you to initialize the UI elements.
     *
     * @param savedInstanceState state bundle brought from the [android.app.Activity.onCreate]
     */
    protected open fun init(savedInstanceState: Bundle?) {
        //
    }

    /**
     * Gets called right after the UI executePendingBindings.
     */
    protected open fun postExecutePendingBindings(savedInstanceState: Bundle?) {
        //
    }

    /**
     * Gets called right after the UI initialization.
     */
    protected open fun postInit() {
        //
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progress = createProgressDialog(this)
        registerStateListeners()
        performDataBinding(savedInstanceState)

        viewModel.viewState.viewState.observe(this, {
            it?.let {
                when (it) {
                    is String -> {
                        showToast(it)
                    }
                    is Boolean -> {
                        showLoader(it)
                    }
                    else -> {

                    }
                }
            }
        })
    }

    private fun createProgressDialog(context: Context): Dialog {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.progress_dialog)
        dialog.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        dialog.setCanceledOnTouchOutside(false)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }

    private fun performDataBinding(savedInstanceState: Bundle?) {
        mViewBinding = DataBindingUtil.setContentView(this, getLayoutId())
        mViewBinding.setVariable(getBindingVariable(), viewModel)
        init(savedInstanceState)
        postInit()
        mViewBinding.executePendingBindings()
        postExecutePendingBindings(savedInstanceState)
    }


    fun showToast(msg: String) {
        if (msg.isNotBlank()) {
            toast(msg)
        }
    }

    private fun showLoader(isVisible: Boolean) {
        if (isVisible) progress?.show() else progress?.dismiss()
    }

    override fun onDestroy() {
        progress?.dismiss()
        unregisterStateListeners()
        viewModel.viewState.viewState.removeObservers(this)
        super.onDestroy()
    }

    private fun registerStateListeners() {
        if (viewModel is BaseViewModel<*>) {
            viewModel.registerLifecycleOwner(this)
        }
    }

    private fun unregisterStateListeners() {
        if (viewModel is BaseViewModel<*>) {
            viewModel.unregisterLifecycleOwner(this)
        }
    }
}