package com.example.mymipmapapplication.activities.bottom.ui.authorization

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.activities.login.SignInActivity

class AuthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        val button = root.findViewById<Button>(R.id.loginButton)
                        button.setOnClickListener{
                            val intent = Intent(activity, SignInActivity::class.java)
                            startActivity(intent)
                        }
        return root
    }

}