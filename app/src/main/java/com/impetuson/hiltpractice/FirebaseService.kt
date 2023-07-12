package com.impetuson.hiltpractice

import android.util.Log
import javax.inject.Inject

class FirebaseService @Inject constructor(){
    fun saveToFirestore(email: String, password: String) {
        Log.d("SAMPLEAPP","Firestore EMAIL: $email PASSWORD: $password saved to DB")
    }
}