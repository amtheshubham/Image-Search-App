package com.shubhaminflow.imagesearchapp.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.shubhaminflow.imagesearchapp.api.UnsplashApi
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) =

        Pager(config = PagingConfig(maxSize = 100, pageSize = 20, enablePlaceholders = false),
            pagingSourceFactory = { UnsplashPagingSource(unsplashApi, query) }).liveData

    //Pager constructor ends. It takes two parameters i.e.,
    //PagingConfig and Pagingsource

    //using livedata will giveback an instance of updated PagingPhotos to observers
}