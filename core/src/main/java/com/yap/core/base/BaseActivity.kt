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
import androidx.lifecycle.Observer
import com.yap.core.R
import com.yap.core.extensions.toast


/**
Created by Faheem Riaz on 02/08/2021.
 **/

abstract class BaseActivity<T : ViewDataBinding, V : IBase.ViewModel<*>> : IBase.View<V>,
    AppCompatActivity() {
    lateinit var binding: T
    private var progress: Dialog? = null

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getBindingVariable(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progress = createProgressDialog(this)
        registerStateListeners()
        performDataBinding()

        viewModel.state.viewState.observe(this, Observer {
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

    private fun performDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.setVariable(getBindingVariable(), viewModel)
        binding.executePendingBindings()
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
        viewModel.state.viewState.removeObservers(this)
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