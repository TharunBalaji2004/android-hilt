package com.impetuson.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("abc@example.com","1234")
    }
}

/*
@HiltAndroidApp - generates Dagger code at backend
Application Class - level which initiates the injection process
*/