package com.example.homeconnect.model

import android.os.Parcelable

data class LoginRequest(
//    @SerializedName("email")
    val email: String,
    val password: String
)