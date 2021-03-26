package com.appchef.api.models.requests

import com.appchef.api.models.entities.LoginData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginRequest(
        @Json(name = "user")
        val user: LoginData
)