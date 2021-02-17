package com.shubhaminflow.imagesearchapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnspalshPhoto(
    val id: String,
    val description: String?,
    val urls: UnsplashPhotoUrls,
    val users: UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnsplashUser(
        val name: String,
        val username: String
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }


    @Parcelize
    data class UnsplashPhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String
    ) : Parcelable

}