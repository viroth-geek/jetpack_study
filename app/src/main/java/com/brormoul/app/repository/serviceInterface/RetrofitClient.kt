package com.brormoul.app.repository.serviceInterface

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        var retrofit : Retrofit? = null
        var baseUrl: String = "https://jsonplaceholder.typicode.com"

        fun getService() : PeopleInterface{
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit!!.create(PeopleInterface::class.java)
        }
    }

}