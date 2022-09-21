package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Audio(
    @Json(name = "isMultiLanguage")
    val isMultiLanguage: Boolean,
    @Json(name = "languages")
    val languages: List<String>
)