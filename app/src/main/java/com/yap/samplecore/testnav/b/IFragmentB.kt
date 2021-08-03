package com.yap.samplecore.testnav.b

import com.yap.core.base.interfaces.IBase

interface IFragmentB {
    interface View : IBase.View<ViewModel>
    interface ViewModel : IBase.ViewModel<State>
    interface State : IBase.State
}