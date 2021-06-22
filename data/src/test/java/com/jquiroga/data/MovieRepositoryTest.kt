package com.jquiroga.data

import com.jquiroga.data.datasource.remote.source.abstraction.MovieRemoteSource
import com.jquiroga.data.repository.MovieDataRepository
import com.jquiroga.domain.repository.MovieRepository
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class MovieRepositoryTest {

    private val movieRemoteSource by lazy { mockk<MovieRemoteSource>(relaxed = true) }

    private lateinit var movieRepository: MovieRepository

    @Before
    fun setup(){
        movieRepository = MovieDataRepository(movieRemoteSource)
    }

    @Test
    fun `when the repository function is executed, then the remote source function is executed`() = runBlockingTest {

        //When
        movieRepository.getMovies()

        //Then
        coVerify(exactly = 1) { movieRemoteSource.getMovies() }
    }


}