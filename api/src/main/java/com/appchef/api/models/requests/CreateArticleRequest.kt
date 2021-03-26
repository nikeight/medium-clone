package com.appchef.api.models.requests


import com.appchef.api.models.entities.ArticleData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateArticleRequest(
        @Json(name = "article")
        val article: ArticleData
)