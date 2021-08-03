package com.yap.samplecore

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import com.yap.core.base.BaseNavActivity
import com.yap.core.utils.NAVIGATION_GRAPH_START_DESTINATION_ID
import com.yap.samplecore.databinding.ActivityMainBinding

class MainActivity : BaseNavActivity<ActivityMainBinding, IMain.State, IMain.ViewModel>(),
    IMain.View {
    override fun getLayoutId(): Int = R.layout.activity_main
    override fun getBindingVariable(): Int = BR.viewModel
    override val viewModel: IMain.ViewModel by viewModels<MainViewModel>()
    override val navigationGraphId: Int
        get() = R.navigation.test_nav

    override val navigationGraphStartDestination: Int
        get() =  intent?.getIntExtra(NAVIGATION_GRAPH_START_DESTINATION_ID, 0) ?: 0

    override fun onDestinationChanged(
        controller: NavController?,
        destination: NavDestination?,
        arguments: Bundle?
    ) {

    }

}