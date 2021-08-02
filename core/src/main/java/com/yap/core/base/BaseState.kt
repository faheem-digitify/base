package com.yap.core.base

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData

abstract class BaseState : BaseObservable(), IBase.State {
    override var viewState: MutableLiveData<Any?> = MutableLiveData()
}