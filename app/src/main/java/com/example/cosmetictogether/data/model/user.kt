package com.example.cosmetictogether.data.model

import com.google.gson.annotations.SerializedName

data class SignInRequest(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)

data class AuthResponse(
    @SerializedName("accessToken") val access: String,
    @SerializedName("refreshToken") val refresh: String,
    @SerializedName("nickName") val nick: String,
    @SerializedName("role") val role: String
)