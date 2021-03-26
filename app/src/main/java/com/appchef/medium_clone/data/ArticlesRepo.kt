package com.appchef.medium_clone.data

import com.appchef.api.ConduitClient

object ArticlesRepo {

    val api = ConduitClient().api

    suspend fun getGlobalFeed() = api.getArticles()
}