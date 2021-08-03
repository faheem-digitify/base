package com.yap.samplecore

import com.digitify.testyappakistan.onboarding.MainState
import com.yap.core.base.BaseViewModel
import com.yap.core.base.SingleClickEvent

class MainViewModel : BaseViewModel<IMain.State>(), IMain.ViewModel {
    override val viewState: IMain.State = MainState()
    override val clickEvent: SingleClickEvent = SingleClickEvent()
}