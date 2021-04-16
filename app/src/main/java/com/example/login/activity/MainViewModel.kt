package com.example.login.activity

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    init{
        Log.d("MainViewModel","init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("MainViewModel","onCleared")
    }
}