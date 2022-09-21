package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Data
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("text/{Query}/sug/on")
    suspend fun getMovieList(
        @Path("Query") searchWord: String,
    ):List<Data>
}