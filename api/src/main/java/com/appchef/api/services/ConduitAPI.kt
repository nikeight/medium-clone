package com.appchef.api.services

import com.appchef.api.models.entities.User
import com.appchef.api.models.entities.UserCredentials
import com.appchef.api.models.requests.SignUpRequest
import com.appchef.api.models.responses.ArticlesResponse
import com.appchef.api.models.responses.UserResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import javax.xml.ws.Response

interface ConduitAPI {
    // All the request EndPoints are declared here.

    @POST("users")
    suspend fun signUpUsers(
            @Body userCredentials: SignUpRequest
    ): Response<UserResponse>

    @GET("articles")
    // Coroutines based method.
    suspend fun getArticles(
            @Query("author") author: String? = null,
            @Query("favourited") favourited: String? = null,
            @Query("tag") tag: String? = null,
    ): Response<ArticlesResponse>
}