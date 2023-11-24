package com.example.mymipmapapplication.model.users
import com.google.gson.annotations.SerializedName

class ApiResponseUsers (
    @SerializedName("data"    ) var data    : ArrayList<Users> = arrayListOf(),
    @SerializedName("success" ) var success : Boolean?        = null
        )