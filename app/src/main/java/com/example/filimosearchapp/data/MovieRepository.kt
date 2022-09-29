package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Movie
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieRemoteDataSource: MovieRemoteDataSource) {

    suspend fun getMovieList(query:String): Movie {
       return movieRemoteDataSource.getMovieList(query)
    }

}