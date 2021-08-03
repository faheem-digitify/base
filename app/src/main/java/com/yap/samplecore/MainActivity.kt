package com.yap.samplecore

import androidx.activity.viewModels
import com.yap.core.base.BaseActivity
import com.yap.samplecore.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, IMain.State, IMain.ViewModel>(), IMain.View {
    override fun getLayoutId(): Int = R.layout.activity_main
    override fun getBindingVariable(): Int = BR.viewModel
    override val viewModel: IMain.ViewModel by viewModels<MainViewModel>()

}