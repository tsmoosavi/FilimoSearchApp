package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Movie
import retrofit2.http.GET
import retrofit2.http.Path

private const val BASE_URL = "https://woocommerce.maktabsharif.ir/wp-json/wc/v3/"
const val CONSUMER_SECRET = "cs_294e7de35430398f323b43c21dd1b29f67b5370b"
const val CONSUMER_KEY = "ck_63f4c52da932ddad1570283b31f3c96c4bd9fd6f"

interface ApiService {

    @GET("text/{Query}/sug/on")
    suspend fun getMovieList(
        @Path ("Query") searchWord: String,
    ): Movie

}