package com.example.filimosearchapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    @Json(name = "age_range")
    val ageRange: String,
    @Json(name = "audio")
    val audio: Audio,
    @Json(name = "avg_rate_label")
    val avgRateLabel: String,
    @Json(name = "badge")
    val badge: Badge,
    @Json(name = "categories")
    val categories: List<Category>,
    @Json(name = "commingsoon_txt")
    val commingsoonTxt: String,
    @Json(name = "countries")
    val countries: List<Country>,
    @Json(name = "cover")
    val cover: Any,
    @Json(name = "descr")
    val descr: String,
    @Json(name = "director")
    val director: Any,
    @Json(name = "dubbed")
    val dubbed: Dubbed,
    @Json(name = "duration")
    val duration: Any,
    @Json(name = "freemium")
    val freemium: Boolean,
    @Json(name = "HD")
    val hD: Boolean,
    @Json(name = "imdb_rate")
    val imdbRate: String, //این خوبه
    @Json(name = "language_info")
    val languageInfo: LanguageInfo,
    @Json(name = "last_watch")
    val lastWatch: List<Any>,
    @Json(name = "link_key")
    val linkKey: String,
    @Json(name = "link_type")
    val linkType: String,
    @Json(name = "movie_id")
    val movieId: String,
    @Json(name = "movie_title")
    val movieTitle: String, //این خوبه
    @Json(name = "movie_title_en")
    val movieTitleEn: String,//این خوبه شاید
    @Json(name = "output_type")
    val outputType: String,
    @Json(name = "pic")
    val pic: Pic,
    @Json(name = "position")
    val position: Int,
    @Json(name = "pro_year")
    val proYear: String,
    @Json(name = "publish_date")
    val publishDate: String,
    @Json(name = "rate_avrage")
    val rateAvrage: String,//این خوبه
    @Json(name = "rate_enable")
    val rateEnable: Boolean,
    @Json(name = "rel_data")
    val relData: RelData,
    @Json(name = "serial")
    val serial: Serial,
    @Json(name = "sid")
    val sid: Int,
    @Json(name = "subtitle")
    val subtitle: Subtitle,
    @Json(name = "tag_id")
    val tagId: Any,
    @Json(name = "theme")
    val theme: String,
    @Json(name = "uid")
    val uid: String,
    @Json(name = "uuid")
    val uuid: String,
    @Json(name = "watch_list_action")
    val watchListAction: String,
    @Json(name = "watermark")
    val watermark: Boolean
)