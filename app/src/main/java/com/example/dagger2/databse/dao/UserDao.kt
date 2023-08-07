package com.example.dagger2.databse.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dagger2.databse.entity.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUsers(list: List<UserEntity>)

    @Query("select * from userentity")
    fun getUsers():List<UserEntity>

}