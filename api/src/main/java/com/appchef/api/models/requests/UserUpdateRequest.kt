package com.appchef.api.models.requests

import com.appchef.api.models.entities.SignupData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserUpdateRequest(
        @Json(name = "user")
        val user: SignupData
)