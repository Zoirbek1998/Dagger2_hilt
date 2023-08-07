package com.example.dagger2.di.modul

import android.content.Context
import androidx.room.Room
import com.example.dagger2.databse.AppDatabase
import com.example.dagger2.databse.dao.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(var context: Context) {

    @Provides
    @Singleton
    fun provideContext():Context = context

    @Provides
    @Singleton
    fun provideAppDatabase(context: Context):AppDatabase{
        return Room.databaseBuilder(context, AppDatabase::class.java, "my_db")
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase):UserDao{
        return appDatabase.userDao()
    }

}