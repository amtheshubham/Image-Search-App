package com.shubhaminflow.imagesearchapp.api

import com.shubhaminflow.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)