package com.appchef.api.models.responses


import com.appchef.api.models.entities.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticlesResponse(
        @Json(name = "articles")
    val articles: List<Article>,
        @Json(name = "articlesCount")
    val articlesCount: Int
)