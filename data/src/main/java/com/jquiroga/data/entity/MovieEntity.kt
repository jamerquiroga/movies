package com.jquiroga.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieEntity(
    @SerialName(FIELD_TITLE)
    val title: String,

    @SerialName(FIELD_OVERVIEW)
    val overview: String,

    @SerialName(FIELD_RELEASE_DATE)
    val releaseDate: String? = null,

    @SerialName(FIELD_POSTER_PATH)
    val posterPath: String?,

    @SerialName(FIELD_BACKDROP_PATH)
    val backdropPath: String?,

    @SerialName(FIELD_ORIGINAL_LANGUAGE)
    val originalLanguage: String,

    @SerialName(FIELD_POPULARITY)
    val popularity: Double,

    @SerialName(FIELD_VOTE_AVERAGE)
    val voteAverage: Double
) {
    internal companion object {
        private const val FIELD_TITLE = "title"
        private const val FIELD_OVERVIEW = "overview"
        private const val FIELD_RELEASE_DATE = "release_date"
        private const val FIELD_POSTER_PATH = "poster_path"
        private const val FIELD_BACKDROP_PATH = "backdrop_path"
        private const val FIELD_ORIGINAL_LANGUAGE = "original_language"
        private const val FIELD_POPULARITY = "popularity"
        private const val FIELD_VOTE_AVERAGE = "vote_average"
    }
}