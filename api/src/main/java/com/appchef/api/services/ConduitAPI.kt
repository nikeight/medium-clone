package com.appchef.api.services

import com.appchef.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET
import javax.xml.ws.Response

interface ConduitAPI {
    // All the request EndPoints are declared here.

    @GET("articles")
    fun getArticles() : Call<ArticlesResponse>
}