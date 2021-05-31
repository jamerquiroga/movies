package com.jquiroga.movies.features.popular.mapper

import com.jquiroga.data.core.mapper.SingleMapper
import com.jquiroga.domain.entity.Movie
import com.jquiroga.movies.features.popular.model.MovieModel
import javax.inject.Inject

class MovieMapper @Inject constructor(): SingleMapper<Movie, MovieModel>() {
    override fun map(value: Movie) = MovieModel(
            title = value.title,
            overview = value.overview,
            releaseDate = value.releaseDate,
            posterPath = value.posterPath,
            backdropPath = value.backdropPath,
            originalLanguage = value.originalLanguage,
            popularity = value.popularity,
            voteAverage = value.voteAverage
    )
}