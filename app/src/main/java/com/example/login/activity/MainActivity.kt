package com.example.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.R
import com.example.login.loginFragment.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(supportFragmentManager.fragments.isEmpty())startLogInFragment()
    }

    private fun startLogInFragment() {
        val loginFragment = LoginFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.conteiner,loginFragment, LoginFragment.TAG)
        transaction.commit()
    }
}