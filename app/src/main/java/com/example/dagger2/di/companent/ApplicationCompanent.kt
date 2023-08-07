package com.example.dagger2.di.companent

import com.example.dagger2.MainActivity
import com.example.dagger2.di.modul.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationCompanent {

    fun inject(mainActivity: MainActivity)
}