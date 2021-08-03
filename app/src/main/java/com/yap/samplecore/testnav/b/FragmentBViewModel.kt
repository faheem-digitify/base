package com.yap.samplecore.testnav.b

import com.yap.core.base.BaseViewModel
import com.yap.core.base.SingleClickEvent

class FragmentBViewModel : BaseViewModel<IFragmentB.State>(), IFragmentB.ViewModel {
    override val viewState: IFragmentB.State = FragmentBState()
    override val clickEvent: SingleClickEvent = SingleClickEvent()
}