package com.yap.samplecore.testnav.a

import com.yap.core.base.BaseViewModel
import com.yap.core.base.SingleClickEvent

class FragmentAViewModel : BaseViewModel<IFragmentA.State>(), IFragmentA.ViewModel {
    override val viewState: IFragmentA.State = FragmentAState()
    override val clickEvent: SingleClickEvent = SingleClickEvent()
}