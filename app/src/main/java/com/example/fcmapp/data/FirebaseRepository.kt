package com.example.fcmapp.data

import javax.inject.Inject

interface FirebaseRepository {
    suspend fun registerFirebase()
}


class FirebaseRepositoryImpl @Inject constructor(
    private val firebaseService: FirebaseService
): FirebaseRepository {
    override suspend fun registerFirebase() {
        return firebaseService.registerFirebase()
    }
}