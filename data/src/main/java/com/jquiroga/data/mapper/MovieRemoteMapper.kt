package com.jquiroga.data.mapper

import com.jquiroga.data.core.mapper.SingleMapper
import com.jquiroga.data.entity.MovieEntity
import com.jquiroga.domain.entity.Movie
import javax.inject.Inject

class MovieRemoteMapper @Inject constructor(): SingleMapper<MovieEntity, Movie>() {

    override fun map(value: MovieEntity) = Movie(
        title = value.title,
        overview = value.overview,
        releaseDate = value.releaseDate.orEmpty(),
        posterPath = value.posterPath.orEmpty(),
        backdropPath = value.backdropPath.orEmpty(),
        originalLanguage = value.originalLanguage,
        popularity = value.popularity,
        voteAverage = value.voteAverage
    )
}