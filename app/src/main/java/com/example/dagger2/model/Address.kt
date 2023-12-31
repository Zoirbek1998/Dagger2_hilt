package com.example.dagger2.model


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("geo")
    val geo: Geo? = null,
    @SerializedName("street")
    val street: String? = null,
    @SerializedName("suite")
    val suite: String? = null,
    @SerializedName("zipcode")
    val zipcode: String? = null
)