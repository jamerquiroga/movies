package com.jquiroga.domain.usecase

import com.jquiroga.domain.repository.MovieRepository
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class GetMoviesUseCaseTest {

    private val movieRepository by lazy { mockk<MovieRepository>(relaxed = true) }

    private lateinit var getMoviesUseCase: GetMoviesUseCase

    @Before
    fun setup() {
        getMoviesUseCase = GetMoviesUseCase(movieRepository)
    }

    @Test
    fun `when the use case is executed, then the repository function is executed`() =
        runBlockingTest {

            //When
            getMoviesUseCase.invoke()

            //Then
            coVerify(exactly = 1) { movieRepository.getMovies() }

        }


}