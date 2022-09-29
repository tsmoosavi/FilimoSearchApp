package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelData(
    @Json(name = "rel_id")
    val relId: Any?,
    @Json(name = "rel_title")
    val relTitle: Any?,
    @Json(name = "rel_type")
    val relType: Any?,
    @Json(name = "rel_type_txt")
    val relTypeTxt: String?,
    @Json(name = "rel_uid")
    val relUid: Any?
)