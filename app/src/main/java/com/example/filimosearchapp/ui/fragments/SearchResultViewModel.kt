package com.example.filimosearchapp.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filimosearchapp.data.MovieRepository
import com.example.filimosearchapp.model.Data
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchResultViewModel @Inject constructor(private val repository: MovieRepository) : ViewModel() {

    var movieList = MutableLiveData<List<Data>>()

    fun getMovieList(query: String){
        viewModelScope.launch {
            movieList.postValue(repository.getMovieList(query))
        }
    }
}