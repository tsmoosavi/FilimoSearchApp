package com.example.filimosearchapp.data

import com.example.filimosearchapp.model.Data
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieRemoteDataSource: MovieRemoteDataSource) {

    suspend fun getMovieList(query:String):List<Data>{
       return movieRemoteDataSource.getMovieList(query)
    }
}