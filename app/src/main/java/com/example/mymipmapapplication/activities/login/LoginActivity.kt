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

        setContentView(R.layout.fragment_login)
        val signIn : Button = findViewById(R.id.singInBtn)
        val loginLayout : EditText = findViewById(R.id.loginEitText)
        val passwordLayout : EditText = findViewById(R.id.passwordEditText)
        signIn.setOnClickListener{
            val login=loginLayout.text.toString().trim()
            val password=passwordLayout.text.toString().trim()
            Sign(login,password)
            Log.e("рп","Ок")
        }
    }

    private fun Sign(login: String, password: String) {
        if(login.isNotEmpty() && password.isNotEmpty()){
            val signIn = ServiceBuilder.buildService(UserInterface::class.java)
            val logCall: Call<ApiResponseUsers> =signIn.getAuth(login,password)
            logCall.enqueue(object : retrofit2.Callback<ApiResponseUsers> {
                override fun onResponse(
                    call: Call<ApiResponseUsers>,
                    response: Response<ApiResponseUsers>
                ) {
                    resultQuery=response.body()!!.success
                    Log.e("",resultQuery.toString())
                    if(resultQuery==true){
                        val intent = Intent(this@LoginActivity, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this@LoginActivity,"Некорректные данные", Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<ApiResponseUsers>, t: Throwable) {
                    Toast.makeText(this@LoginActivity,"Не все поляляляля заполнены", Toast.LENGTH_LONG).show()
                }

            })
        } else{
            Toast.makeText(this,"Не все поля заполнены", Toast.LENGTH_LONG).show()
        }

    }
}