package com.example.mymipmapapplication.datasource

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    private val client = OkHttpClient.Builder().build()
    private val retrofit = Retrofit.Builder()
        //   Если не работает -> 188.234.244.32 то юзаем -> 172.30.44.151 а я юзаю localhost
        .baseUrl("https://0b14-79-172-44-238.ngrok.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
}
}