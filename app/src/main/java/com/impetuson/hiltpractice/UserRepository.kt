package com.impetuson.hiltpractice

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("UserRepository","SQL EMAIL: $email PASSWORD: $password saved to DB")
    }
}

class FirebaseRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("UserRepository","Firebase EMAIL: $email PASSWORD: $password saved to DB")
    }
}