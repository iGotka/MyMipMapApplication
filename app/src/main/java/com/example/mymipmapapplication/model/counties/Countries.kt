package com.example.mymipmapapplication.model.counties

import com.google.gson.annotations.SerializedName

class Countries(
    @SerializedName("id_countries"    ) var id : Int? = null,
    @SerializedName("countries"    ) var countries: String? = null,
    @SerializedName("descriptor"    ) var descriptor: String? = null,
    @SerializedName("id_region"    ) var id_region: Int? = null
)