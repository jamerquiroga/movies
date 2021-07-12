package com.jquiroga.movies.features.popular.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.jquiroga.movies.core.extensions.gone
import com.jquiroga.movies.core.failure.FailureModel

import com.jquiroga.movies.core.platform.BaseFragment
import com.jquiroga.movies.databinding.FragmentPopularMoviesBinding
import com.jquiroga.movies.features.popular.adapter.PopularMovieAdapter
import com.jquiroga.movies.features.popular.model.MovieModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularMoviesFragment : BaseFragment() {

    private var _viewBinding: FragmentPopularMoviesBinding? = null

    private val viewBinding get() = _viewBinding!!

    private val mainViewModel by viewModels<PopularMoviesViewModel>()

    private val popularMovieAdapter by lazy { PopularMovieAdapter() }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentPopularMoviesBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun initUI() {
        mainViewModel.getMovies()
        setUpRecycler()
    }

    override fun initObservers() {
        mainViewModel.movieList.observe(this, movieListObserver)
        mainViewModel.failureModel.observe(this, failureObserver)
    }

    private fun setUpRecycler() {
        viewBinding.recyclerPopularMovies.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = popularMovieAdapter
        }
    }

    private val movieListObserver = Observer<List<MovieModel>> { movieList ->
        viewBinding.progressLoader.gone()
        popularMovieAdapter.addMovies(movieList)
    }

    private val failureObserver = Observer<FailureModel> { failure ->
        Snackbar.make(
                viewBinding.root,
                failure.message,
                Snackbar.LENGTH_SHORT
        ).show()
    }

}