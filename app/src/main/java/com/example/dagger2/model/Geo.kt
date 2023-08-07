package com.example.dagger2.model


import com.google.gson.annotations.SerializedName

data class Geo(
    @SerializedName("lat")
    val lat: String? = null,
    @SerializedName("lng")
    val lng: String? = null
)