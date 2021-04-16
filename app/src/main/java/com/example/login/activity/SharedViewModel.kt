package com.example.login.activity

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.model.User

class SharedViewModel:ViewModel() {
    val user = MutableLiveData<User>()
    init{
        user.value= User("Vitaliy","Pass!!!")
    }
    fun IsValidate(userValidate: User)
    : Boolean {
        user.value.let { u->
            if (u==userValidate){
                return true;
            }
        }
        return false
    }
}