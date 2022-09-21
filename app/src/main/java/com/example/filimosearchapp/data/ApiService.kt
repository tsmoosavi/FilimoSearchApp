package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Data
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("products/{id}")
    suspend fun getProduct(
        @Path("Query") searchWord: String,
    ):List<Data>
}