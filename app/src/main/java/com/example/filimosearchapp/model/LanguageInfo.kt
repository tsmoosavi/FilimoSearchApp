package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LanguageInfo(
    @Json(name = "flag")
    val flag: String,
    @Json(name = "text")
    val text: String
)