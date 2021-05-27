package com.jquiroga.domain.entity

data class Movie(
    val title: String,
    val overview: String,
    val releaseDate: String,
    val posterPath: String,
    val backdropPath: String,
    val originalLanguage: String,
    val popularity: Double,
    val voteAverage: Double
)