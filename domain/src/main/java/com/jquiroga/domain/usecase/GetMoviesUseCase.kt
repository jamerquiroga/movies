package com.jquiroga.domain.usecase

import com.jquiroga.domain.entity.Movie
import com.jquiroga.domain.repository.MovieRepository
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    suspend operator fun invoke(): List<Movie> {
        return movieRepository.getMovies()
    }
}