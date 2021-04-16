package com.example.login.welcomeFragment

import android.util.Log
import androidx.lifecycle.ViewModel

class WelcomeViewModel:ViewModel() {
    init{
        Log.d("MainViewModel","init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("MainViewModel","onCleared")
    }
}