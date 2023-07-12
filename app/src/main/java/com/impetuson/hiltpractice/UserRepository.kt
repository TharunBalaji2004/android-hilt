package com.impetuson.hiltpractice

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val firebaseService: FirebaseService
){
    fun saveUser(email: String, password: String){
        firebaseService.saveToFirestore(email,password)
    }
}