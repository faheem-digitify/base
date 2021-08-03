package com.yap.core.base

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import com.yap.core.base.interfaces.IBase

abstract class BaseState : BaseObservable(), IBase.State {
    override var viewState: MutableLiveData<Any?> = MutableLiveData()
}