package com.yap.samplecore.testnav.b

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import com.yap.core.base.BaseNavFragment
import com.yap.samplecore.BR
import com.yap.samplecore.R
import com.yap.samplecore.databinding.FragmentBBinding

class FragmentB :
    BaseNavFragment<FragmentBBinding, IFragmentB.State, FragmentBViewModel>(R.layout.fragment_b) {
    override val viewModel: FragmentBViewModel by viewModels()
    override fun getBindingVariable(): Int = BR.viewModel
    override fun onClick(id: Int) {
        when (id) {
            R.id.btnBack -> {
                navigateBack()
            }
            R.id.btnBackResult -> {
                navigateBackWithResult(111111, bundleOf("FROM_FRAGMENT_B" to true))
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleExtras()
    }

    private fun handleExtras() {
        val extra = arguments?.getString("FROM_FRAGMENT_A")
        showToast(extra ?: "")
    }
}