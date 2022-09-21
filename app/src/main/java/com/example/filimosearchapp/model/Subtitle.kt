package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Subtitle(
    @Json(name = "enable")
    val enable: Boolean,
    @Json(name = "text")
    val text: String
)