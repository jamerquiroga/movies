package com.jquiroga.data.datasource.remote.source.abstraction

import com.jquiroga.domain.entity.Movie

interface MovieRemoteSource {

    suspend fun getMovies(): List<Movie>

}