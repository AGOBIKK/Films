package com.agobikk.films.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agobikk.films.data.retrofit.RetrofitRepository
import com.agobikk.films.models.MoviesModel
import kotlinx.coroutines.launch
import retrofit2.Response

class MainFragmentViewModel : ViewModel() {

    private val repository = RetrofitRepository()
    val mMovies: MutableLiveData<Response<MoviesModel>> = MutableLiveData() // так отдавать не правильно нужно Ан-Мютобал


    fun getMovies() {
        viewModelScope.launch {
            mMovies.value = repository.getMovies()
        }
    }
}