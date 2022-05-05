package com.agobikk.films.data.retrofit

import com.agobikk.films.data.retrofit.api.RetrofitInstance
import com.agobikk.films.models.MoviesModel
import retrofit2.Response

class RetrofitRepository {
    suspend fun getMovies(): Response<MoviesModel> {
        return RetrofitInstance.api.getPopularMovie()
    }
}