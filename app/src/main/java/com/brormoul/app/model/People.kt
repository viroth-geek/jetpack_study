package com.brormoul.app.model

import com.google.gson.annotations.SerializedName

data class People(
    @SerializedName("id")
    var id: String,
    @SerializedName("username")
    var name:String,
    var email: String
)