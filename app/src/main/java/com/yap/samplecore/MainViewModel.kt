package com.yap.samplecore

import com.digitify.testyappakistan.onboarding.MainState
import com.yap.core.base.BaseViewModel

class MainViewModel : BaseViewModel<IMain.State>(), IMain.ViewModel {
    override val viewState: IMain.State = MainState()
}