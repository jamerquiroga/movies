package com.jquiroga.data.datasource.remote.api

import com.jquiroga.data.datasource.remote.response.MoviesResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET("popular")
    suspend fun getMovies(): Response<MoviesResponse>

}