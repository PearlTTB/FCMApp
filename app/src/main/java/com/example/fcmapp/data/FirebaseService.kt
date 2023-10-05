package com.example.fcmapp.data

interface FirebaseService {
    suspend fun registerFirebase()
}


class FirebaseServiceImpl():FirebaseService {
    override suspend fun registerFirebase() {
        TODO("Not yet implemented")
    }
}