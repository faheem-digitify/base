package com.yap.samplecore.testnav.a

import com.yap.core.base.interfaces.IBase

interface IFragmentA {
    interface View : IBase.View<ViewModel>
    interface ViewModel : IBase.ViewModel<State>
    interface State : IBase.State
}