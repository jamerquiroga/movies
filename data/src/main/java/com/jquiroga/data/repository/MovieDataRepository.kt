package com.jquiroga.data.repository

import com.jquiroga.domain.entity.Movie
import com.jquiroga.domain.repository.MovieRepository
import com.jquiroga.data.datasource.remote.source.abstraction.MovieRemoteSource

class MovieDataRepository(private val movieRemoteSource: MovieRemoteSource) : MovieRepository {

    override suspend fun getMovies(): List<Movie> {
        return movieRemoteSource.getMovies()
    }

}