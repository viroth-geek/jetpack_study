package com.brormoul.app.repository.serviceInterface

import com.brormoul.app.model.People
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PeopleInterface {
    @GET("/users")
    fun getUsers(): Call<ArrayList<People>>

    @GET("/users/{id}")
    fun getUserById(@Path("id") id: Int) : Call<People>

}