package com.yap.core.base.interfaces

import androidx.lifecycle.MutableLiveData

interface IBase {
    interface View<V : ViewModel<*>> {
        val viewModel: V
    }

    interface ViewModel<S : State> :
        ILifecycle {
        val viewState: S
    }

    interface State {
        var viewState: MutableLiveData<Any?>
    }
}