package com.example.dagger2

import android.app.Application
import com.example.dagger2.di.companent.ApplicationCompanent
import com.example.dagger2.di.companent.DaggerApplicationCompanent
import com.example.dagger2.di.modul.DatabaseModule

class App : Application() {

    companion object {
        lateinit var applicationCompanent: ApplicationCompanent
    }

    override fun onCreate() {
        super.onCreate()
        applicationCompanent = DaggerApplicationCompanent
            .builder()
            .databaseModule(DatabaseModule(applicationContext))
            .build()
    }
}