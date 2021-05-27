package com.jquiroga.data.datasource.remote.response

import com.jquiroga.data.entity.MovieEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MoviesResponse(
    @SerialName(FIELD_PAGE)
    val page: Int,

    @SerialName(FIELD_RESULTS)
    val moviesList: List<MovieEntity>
) {
    internal companion object {
        private const val FIELD_PAGE = "page"
        private const val FIELD_RESULTS = "results"
    }
}