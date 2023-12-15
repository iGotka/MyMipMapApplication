package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.users.ApiResponseUsers
import com.example.mymipmapapplication.model.users.Users
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UserInterface {
    @Headers("Content-Type:application/json")
    @GET("users/")
    fun getUser(@Query("login")login:String): Call<ApiResponseUsers>

    @Headers("Content-Type:application/json")
    @GET("users/")
    fun getAuth(
        @Query("login")login:String,
        @Query("password")password:String
    ): Call<ApiResponseUsers>
}