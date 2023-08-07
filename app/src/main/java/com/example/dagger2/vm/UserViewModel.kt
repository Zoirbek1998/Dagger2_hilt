package com.example.dagger2.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger2.repository.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel @Inject constructor(private val userRepostory: UserRepository) : ViewModel() {
    private val TAG = "UserViewModel"

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            Log.d(TAG, "fetchUsers: ${userRepostory.getUsers()}")
        }
    }
}