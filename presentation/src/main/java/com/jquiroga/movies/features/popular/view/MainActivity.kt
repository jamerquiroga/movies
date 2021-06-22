package com.jquiroga.movies.features.popular.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jquiroga.movies.core.extensions.gone
import com.jquiroga.movies.core.failure.FailureModel
import com.jquiroga.movies.core.platform.BaseActivity
import com.jquiroga.movies.databinding.ActivityMainBinding
import com.jquiroga.movies.features.popular.adapter.PopularMovieAdapter
import com.jquiroga.movies.features.popular.model.MovieModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mainViewModel by viewModels<MainViewModel>()

    private val popularMovieAdapter by lazy { PopularMovieAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }

    override fun initUI() {
        mainViewModel.getMovies()
        setUpRecycler()
    }

    override fun initObservers() {
        mainViewModel.movieList.observe(this, movieListObserver)
        mainViewModel.failureModel.observe(this, failureObserver)
    }

    private fun setUpRecycler(){
        viewBinding.recyclerPopularMovies.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter = popularMovieAdapter
        }
    }

    private val movieListObserver = Observer<List<MovieModel>> { movieList ->
        viewBinding.progressLoader.gone()
        popularMovieAdapter.addMovies(movieList)
    }

    private val failureObserver = Observer<FailureModel> { failure ->
        Toast.makeText(this, failure.message, Toast.LENGTH_SHORT).show()
    }

}