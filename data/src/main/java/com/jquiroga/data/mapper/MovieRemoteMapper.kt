package com.jquiroga.data.mapper

import com.jquiroga.data.core.mapper.SingleMapper
import com.jquiroga.data.entity.MovieEntity
import com.jquiroga.domain.entity.Movie

class MovieRemoteMapper : SingleMapper<MovieEntity, Movie>() {

    override fun map(value: MovieEntity) = Movie(
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