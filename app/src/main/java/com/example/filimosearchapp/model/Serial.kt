package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Serial(
    @Json(name = "enable")
    val enable: Boolean,
    @Json(name = "last_part")
    val lastPart: Any,
    @Json(name = "parent_title")
    val parentTitle: String,
    @Json(name = "part_text")
    val partText: String,
    @Json(name = "season_id")
    val seasonId: Any,
    @Json(name = "season_text")
    val seasonText: String,
    @Json(name = "serial_part")
    val serialPart: String
)