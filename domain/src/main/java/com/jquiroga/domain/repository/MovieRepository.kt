package com.jquiroga.domain.repository

import com.jquiroga.domain.entity.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>

}