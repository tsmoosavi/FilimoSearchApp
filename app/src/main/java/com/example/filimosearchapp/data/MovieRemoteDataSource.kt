package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Attributes
import com.example.filimosearchapp.model.Data
import com.example.filimosearchapp.model.Movie
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovieList(query: String): Movie {
        return apiService.getMovieList(query)
    }

}