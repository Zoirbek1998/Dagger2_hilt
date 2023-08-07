package com.example.dagger2.networking

import com.example.dagger2.model.UserData
import retrofit2.http.GET

interface ApiServices {

    @GET("users")
   suspend fun getUsers():List<UserData>
}