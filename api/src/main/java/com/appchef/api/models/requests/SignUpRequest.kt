package com.appchef.api.models.requests


import com.appchef.api.models.entities.UserCredentials
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpRequest(
    @Json(name = "user")
    val user: UserCredentials
)