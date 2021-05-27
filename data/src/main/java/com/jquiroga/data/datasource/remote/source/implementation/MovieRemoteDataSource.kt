package com.jquiroga.data.datasource.remote.source.implementation

import com.jquiroga.data.core.network.safeApiCall
import com.jquiroga.data.datasource.remote.api.MovieApi
import com.jquiroga.domain.entity.Movie
import com.jquiroga.data.datasource.remote.source.abstraction.MovieRemoteSource
import com.jquiroga.data.mapper.MovieRemoteMapper
import com.jquiroga.domain.exception.EmptyDataException

class MovieRemoteDataSource(
    private val movieApi: MovieApi,
    private val movieRemoteMapper: MovieRemoteMapper
) : MovieRemoteSource {

    override suspend fun getMovies(): List<Movie> {
        val response = safeApiCall {
            movieApi.getMovies()
        }

        response?.let {
            return movieRemoteMapper.map(it.moviesList)
        } ?: throw EmptyDataException()

    }

}