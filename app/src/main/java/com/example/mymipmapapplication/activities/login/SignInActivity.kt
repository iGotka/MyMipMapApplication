package com.example.mymipmapapplication.activities.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.activities.main.MainActivity
import com.example.mymipmapapplication.datasource.ServiceBuilder
import com.example.mymipmapapplication.interfaces.UserInterface
import com.example.mymipmapapplication.model.users.ApiResponseUsers
import com.example.mymipmapapplication.model.users.Users
import com.google.gson.JsonObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Path

class SignInActivity : AppCompatActivity() {
    private var resultQuery:Boolean?=false
//  private lateinit var resultQuery:JsonObject


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val signIn : Button = findViewById(R.id.singInBtn)
        val loginLayout : EditText = findViewById(R.id.loginEitText)
        val passwordLayout : EditText = findViewById(R.id.passwordEditText)
        signIn.setOnClickListener{
            val login=loginLayout.text.toString().trim()
            val password=passwordLayout.text.toString().trim()
            Sign(login,password)
        }
    }
    fun Sign(login: String, password: String) {
        if(login.isNotEmpty() && password.isNotEmpty()){
            val signIn = ServiceBuilder.buildService(UserInterface::class.java)
            signIn.getAuth(login,password).enqueue(object : retrofit2.Callback<Users> {
                override fun onResponse(
                    call: Call<Users>,
                    response: Response<Users>
                ) {
                    resultQuery = response.isSuccessful
                    Log.e("0000", response.body().toString())
                    if(resultQuery==true){
                        val intent = Intent(this@SignInActivity, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this@SignInActivity,"Некорректные данные", Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<Users>, t: Throwable) {
                    Toast.makeText(this@SignInActivity,"Не все поляляляля заполнены", Toast.LENGTH_LONG).show()
                }
            })
        } else {
            Toast.makeText(this,"Не все поля засеяны", Toast.LENGTH_LONG).show()
        }
    }
}