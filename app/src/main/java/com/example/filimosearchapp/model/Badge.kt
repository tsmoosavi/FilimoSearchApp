package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Badge(
    @Json(name = "backstage")
    val backstage: Boolean,
    @Json(name = "commingsoon")
    val commingsoon: Boolean,
    @Json(name = "exclusive")
    val exclusive: Boolean,
    @Json(name = "free")
    val free: Boolean,
    @Json(name = "hear")
    val hear: Boolean,
    @Json(name = "info")
    val info: List<Info>,
    @Json(name = "online_release")
    val onlineRelease: Boolean,
    @Json(name = "vision")
    val vision: Boolean
)