package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Info(
    @Json(name = "background_color")
    val backgroundColor: String,
    @Json(name = "icon")
    val icon: String,
    @Json(name = "text")
    val text: String,
    @Json(name = "text_color")
    val textColor: String,
    @Json(name = "type")
    val type: String
)