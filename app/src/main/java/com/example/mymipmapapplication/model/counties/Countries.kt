package com.example.mymipmapapplication.model.counties

import com.google.gson.annotations.SerializedName

data class Countries(
    @SerializedName("id_countries"    ) var id : Int? = null,
    @SerializedName("countries"    ) var countries: String? = null,
    @SerializedName("flag"    ) var flag: String? = null,
    @SerializedName("descriptions"    ) var descriptions: String? = null,
    @SerializedName("capital"    ) var capital: String? = null,
    @SerializedName("language"    ) var language: String? = null,
    @SerializedName("fullname"    ) var fullname: String? = null,
    @SerializedName("id_region"    ) var id_region: Int? = null
)