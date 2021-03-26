package com.appchef.medium_clone.ui.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appchef.api.models.entities.Article
import com.appchef.medium_clone.data.ArticlesRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FeedViewModel : ViewModel() {

    private val _feed = MutableLiveData<List<Article>>()

    val feed : LiveData<List<Article>> = _feed

    // Todo Update the Method here.
//    fun fetchUpdateFeed() = viewModelScope.launch {
//         ArticlesRepo.getGlobalFeed()?.let {
//             _feed.postValue()
//         }
//    }
}