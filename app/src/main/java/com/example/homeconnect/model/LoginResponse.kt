package com.example.homeconnect.model

data class LoginResponse(
    val status: Boolean,
    val message: String,
    val token: String,
    val userid: Long,
    val userType: Int
)
