package com.example.mymipmapapplication.interfaces

import com.example.mymipmapapplication.model.counties.ApiResponseCountries
import com.example.mymipmapapplication.model.regions.ApiResponseRegions
import com.example.mymipmapapplication.model.users.ApiResponseUsers
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

    @GET("User/id")
    fun getUserById(@Path("id") id : Int): Call<ApiResponseUsers>
    @GET("User")
    fun getUser(): Call<ApiResponseUsers>
}