package com.example.mymipmapapplication.datasource

import com.example.mymipmapapplication.interfaces.APIServiceInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    private val apiService =ServiceBuilder.getService()

    @Volatile
    private var INSTANCE: APIServiceInterface? = null
    fun getService(): APIServiceInterface {
        if(INSTANCE == null){
            synchronized(this){
                INSTANCE = buildService()
            }
        }
        return INSTANCE!!
    }

    private val client = OkHttpClient.Builder().build()
    private val retrofit = Retrofit.Builder()
        //   Если не работает -> 188.234.244.32 то юзаем -> 172.30.44.151 а я юзаю localhost
        .baseUrl("https://5250-79-172-44-238.ngrok-free.app/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private fun buildService():APIServiceInterface {

        return retrofit.create(APIServiceInterface::class.java)
}
}