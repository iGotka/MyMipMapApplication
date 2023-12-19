package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.users.ApiResponseUsers
import com.example.mymipmapapplication.model.users.Users
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface UserInterface {
    @Headers("Content-Type:application/json")
    @GET("Users/")
    fun getAuth(
        @Query("login")login: String,
        @Query("password")password:String
    ): Call<Users>
}