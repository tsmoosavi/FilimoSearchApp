package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Category(
    @Json(name = "link_key")
    val linkKey: String,
    @Json(name = "link_type")
    val linkType: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "title_en")
    val titleEn: String
)