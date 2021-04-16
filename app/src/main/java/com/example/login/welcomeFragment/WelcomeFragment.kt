package com.example.login.welcomeFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import com.example.login.R
import com.example.login.activity.SharedViewModel

class WelcomeFragment : Fragment() {
    companion object {
        const val TAG="WelcomeFragment"
    }
    private  val sharedview: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView=view.findViewById<TextView>(R.id.tv_welcome)
        sharedview.user.observe(viewLifecycleOwner){ user->
            textView.text= ("Welcome, ${user.name}!" )
        }
    }
}