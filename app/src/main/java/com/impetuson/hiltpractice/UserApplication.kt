package com.impetuson.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {

    override fun onCreate() {
        super.onCreate()

    }
}

/*
@HiltAndroidApp - generates Dagger code at backend
Application Class - level which initiates the injection process
*/