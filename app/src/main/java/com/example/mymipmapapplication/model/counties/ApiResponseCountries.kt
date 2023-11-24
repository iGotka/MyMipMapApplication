package com.example.mymipmapapplication.model.counties

import com.google.gson.annotations.SerializedName

class ApiResponseCountries (
    @SerializedName("data"    ) var data    : ArrayList<Countries> = arrayListOf(),
    @SerializedName("success" ) var success : Boolean?        = null
)