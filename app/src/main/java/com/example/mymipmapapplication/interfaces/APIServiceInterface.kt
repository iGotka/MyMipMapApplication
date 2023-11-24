package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.counties.ApiResponseCountries
import com.example.mymipmapapplication.model.regions.ApiResponseRegions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIServiceInterface {
    /*Города*/
    @GET("Countries")
    fun getCountries(): Call<ApiResponseCountries>

    @GET("Countries/id")
    fun getCountriesById(@Path("id_countries") id : Int): Call<ApiResponseCountries>
    /*Регионы*/
    @GET("Regions")
    fun getRegions(): Call<ApiResponseCountries>

    @GET("Regions/id")
    fun getRegionsById(@Path("id_regions") id_regions : Int): Call<ApiResponseRegions>
}