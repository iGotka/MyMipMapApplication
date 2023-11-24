package com.example.mymipmapapplication.model.regions

import com.google.gson.annotations.SerializedName

class ApiResponseRegions (
    @SerializedName("data"    ) var data    : ArrayList<Regions> = arrayListOf(),
    @SerializedName("success" ) var success : Boolean?        = null
        )