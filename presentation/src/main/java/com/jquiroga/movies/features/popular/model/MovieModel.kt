package com.jquiroga.movies.features.popular.model

data class MovieModel(
        val title: String,
        val overview: String,
        val releaseDate: String,
        val posterPath: String,
        val backdropPath: String,
        val originalLanguage: String,
        val popularity: Double,
        val voteAverage: Double
)