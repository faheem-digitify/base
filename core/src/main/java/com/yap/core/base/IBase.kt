package com.yap.core.base

import androidx.lifecycle.MutableLiveData

interface IBase {
    interface View<V : ViewModel<*>> {
        val viewModel: V
    }

    interface ViewModel<S : State> :
        ILifecycle {
        val state: S
    }

    interface State {
        var viewState: MutableLiveData<Any?>
    }
}