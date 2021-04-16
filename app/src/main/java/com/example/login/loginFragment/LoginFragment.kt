package com.example.login.loginFragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.login.R
import com.example.login.activity.SharedViewModel
import com.example.login.model.User
import com.example.login.welcomeFragment.WelcomeFragment


class LoginFragment : Fragment() {
    companion object {
        const val TAG="LoginFragment"
    }
    private  val sharedview: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    private fun startWelcomeFragment() {
        val welcomeFragment = WelcomeFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.add(R.id.conteiner, welcomeFragment, WelcomeFragment.TAG)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.b_logIn).setOnClickListener {
            val tv_login=view.findViewById<EditText>(R.id.et_login)
            val tv_password=view.findViewById<EditText>(R.id.et_password)
            if (sharedview.IsValidate(User(tv_login.text.toString(), tv_password.text.toString()))) {
                val transaction = parentFragmentManager.beginTransaction()
                val fragment = WelcomeFragment();
                transaction.replace(R.id.conteiner, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else  {
                Toast.makeText(
                    activity,
                    "Неверный логин или пароль!", Toast.LENGTH_LONG
                ).show()
            }
            tv_login.text.clear()
            tv_password.text.clear()
        }

    }
}