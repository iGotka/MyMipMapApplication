package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.counties.ApiResponseCountries
import com.example.mymipmapapplication.model.counties.Countries
import com.example.mymipmapapplication.model.regions.ApiResponseRegions
import com.example.mymipmapapplication.model.users.ApiResponseUsers
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIServiceInterface {
    /*Города*/
    @GET("Countries/")
    fun getCountries(): Call<ApiResponseCountries>

    @GET("Countries/")
    fun getAllCountries(): Call<List<Countries>>
    /*Регионы*/
    @GET("Regions/")
    fun getRegions(): Call<ApiResponseCountries>

    @GET("Regions/id")
    fun getRegionsById(@Path("id_regions") id_regions : Int): Call<ApiResponseRegions>


}