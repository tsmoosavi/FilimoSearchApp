package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movie(
    @Json(name = "data")
    val `data`: List<Data>
)