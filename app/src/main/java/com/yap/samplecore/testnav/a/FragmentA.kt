package com.yap.samplecore.testnav.a

import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import com.yap.core.base.BaseNavFragment
import com.yap.core.base.navgraph.BackNavigationResult
import com.yap.core.base.navgraph.BackNavigationResultListener
import com.yap.samplecore.BR
import com.yap.samplecore.R
import com.yap.samplecore.databinding.FragmentABinding

class FragmentA :
    BaseNavFragment<FragmentABinding, IFragmentA.State, FragmentAViewModel>(R.layout.fragment_a),
    BackNavigationResultListener {
    override val viewModel: FragmentAViewModel by viewModels()
    override fun getBindingVariable(): Int = BR.viewModel
    override fun onClick(id: Int) {
        when (id) {
            R.id.btnNext -> {
                navigate(R.id.action_fragmentA_to_fragmentB)
            }
            R.id.btnSetResult -> {
                navigateForResult(
                    requestCode = 111111,
                    resId = R.id.action_fragmentA_to_fragmentB,
                    args = bundleOf("FROM_FRAGMENT_A" to "Fragment A data")
                )
            }
        }
    }

    override fun onNavigationResult(result: BackNavigationResult) {
        if (result.data?.getBoolean("FROM_FRAGMENT_B") == true) {
            showToast("From fragment b set result")
        } else {
            showToast("From fragment b set no result")
        }
    }
}