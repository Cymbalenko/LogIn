package com.example.login.loginFragment

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {
    init{
        Log.d("MainViewModel","init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("MainViewModel","onCleared")
    }
}