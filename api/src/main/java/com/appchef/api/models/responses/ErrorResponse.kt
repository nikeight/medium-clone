package com.appchef.api.models.responses


import com.appchef.api.models.entities.Errors
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "errors")
    val errors: Errors
)