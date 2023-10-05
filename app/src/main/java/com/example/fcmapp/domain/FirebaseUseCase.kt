package com.example.fcmapp.domain

import com.example.fcmapp.data.FirebaseRepository
import javax.inject.Inject

class FirebaseUseCase @Inject constructor(
    private val firebaseRepository: FirebaseRepository
) {

    suspend fun execute() {
        //TODO: logic more
        firebaseRepository.registerFirebase()
    }
}