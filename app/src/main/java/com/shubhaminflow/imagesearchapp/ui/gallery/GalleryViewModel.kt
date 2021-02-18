package com.shubhaminflow.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.shubhaminflow.imagesearchapp.data.UnsplashRepository
import javax.inject.Inject

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {

    private val currentquery = MutableLiveData("")

    fun searchQuery(query: String) {
        currentquery.value = query
    }

    val photos = currentquery.switchMap { query ->
        repository.getSearchResults(query)

    }
}