package com.example.filimosearchapp.ui.fragments.search_result

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filimosearchapp.data.MovieRepository
import com.example.filimosearchapp.model.Attributes
import com.example.filimosearchapp.model.Data
import com.example.filimosearchapp.model.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchResultViewModel @Inject constructor(private val repository: MovieRepository) : ViewModel() {

    var movieList = MutableLiveData<List<Data>>()
//    var listOfMovies = MutableLiveData<Data>()

    fun getMovieList(query: String){
        viewModelScope.launch {
            movieList.postValue(repository.getMovieList(query).data)
        }
    }


}