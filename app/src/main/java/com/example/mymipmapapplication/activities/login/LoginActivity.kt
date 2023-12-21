package com.example.mymipmapapplication.activities.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.activities.main.MainActivity
import com.example.mymipmapapplication.datasource.ServiceBuilder
import com.example.mymipmapapplication.interfaces.UserInterface
import com.example.mymipmapapplication.model.users.ApiResponseUsers
import retrofit2.Call
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private var resultQuery:Boolean?=false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

    }

    }
