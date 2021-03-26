package com.appchef.api.services

import com.appchef.api.models.entities.User
import com.appchef.api.models.entities.UserCredentials
import com.appchef.api.models.requests.LoginRequest
import com.appchef.api.models.requests.SignUpRequest
import com.appchef.api.models.responses.ArticleResponse
import com.appchef.api.models.responses.ArticlesResponse
import com.appchef.api.models.responses.UserResponse
import retrofit2.http.*
import javax.xml.ws.Response

interface ConduitAPI {
    // All the request EndPoints are declared here.

    @POST("users")
    suspend fun loginUser(
            @Body userCreds: LoginRequest
    ): Response<UserResponse>

    @GET("articles/{slug}")
    suspend fun getArticleBySlug(
            @Path("slug") slug: String
    ): Response<ArticleResponse>


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