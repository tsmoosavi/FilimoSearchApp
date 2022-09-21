package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Data
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovieList(query: String): List<Data>{
        return apiService.getMovieList(query)
    }
}