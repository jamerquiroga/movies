package com.jquiroga.movies.features.popular.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jquiroga.domain.usecase.GetMoviesUseCase
import com.jquiroga.movies.core.extensions.safeLaunch
import com.jquiroga.movies.core.extensions.with
import com.jquiroga.movies.core.failure.FailureMapper
import com.jquiroga.movies.core.failure.FailureModel
import com.jquiroga.movies.features.popular.mapper.MovieMapper
import com.jquiroga.movies.features.popular.model.MovieModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class PopularMoviesViewModel @Inject constructor(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val movieMapper: MovieMapper,
    private val failureMapper: FailureMapper,
    private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    private val _failureModel = MutableLiveData<FailureModel>()
    val failureModel: LiveData<FailureModel>
        get() = _failureModel

    private val _movieList = MutableLiveData<List<MovieModel>>()
    val movieList: LiveData<List<MovieModel>>
        get() = _movieList

    fun getMovies() {
        viewModelScope.safeLaunch(::handleException) {
            val result = with(dispatcher) {
                getMoviesUseCase.invoke()
            }
            _movieList.value = movieMapper.map(result)
        }
    }

    private fun handleException(t: Throwable) {
        val failure = failureMapper.map(t)
        _failureModel.postValue(failure)
    }

}