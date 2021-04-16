package com.example.login.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class User (
    val name:String,
    val password:String
): Parcelable
