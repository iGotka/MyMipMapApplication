package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.users.ApiResponseUsers
import com.example.mymipmapapplication.model.users.Users
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UserInterface {
    @Headers("Content-Type:application/json")
    @GET("profile_users/")
    fun getUser(@Query("login")login:String): Call<Users>

    @Headers("Content-Type:application/json")
    @GET("profile_users/")
    fun getAuth(
        @Query("login")login:String,
        @Query("password")password:String
    ): Call<ApiResponseUsers>
}