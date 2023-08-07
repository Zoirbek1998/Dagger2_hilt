package com.example.dagger2.repository

import com.example.dagger2.networking.ApiServices
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiServices: ApiServices) {
    suspend fun getUsers() = apiServices.getUsers()
}