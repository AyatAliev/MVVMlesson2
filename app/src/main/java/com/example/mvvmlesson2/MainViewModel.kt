package com.example.mvvmlesson2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0

    val counter = MutableLiveData<Int>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
    }

}