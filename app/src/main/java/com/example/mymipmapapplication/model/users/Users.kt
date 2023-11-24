package com.example.mymipmapapplication.model.users

import com.google.gson.annotations.SerializedName

class Users (
    @SerializedName("login"      ) var login     : String? = null,
    @SerializedName("password"       ) var password       : String?    = null
        )