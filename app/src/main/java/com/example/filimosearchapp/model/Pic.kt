package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pic(
    @Json(name = "movie_img_b")
    val movieImgB: String,
    @Json(name = "movie_img_m")
    val movieImgM: String,
    @Json(name = "movie_img_s")
    val movieImgS: String
)