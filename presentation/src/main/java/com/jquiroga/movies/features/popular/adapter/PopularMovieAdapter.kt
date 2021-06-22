package com.jquiroga.movies.features.popular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jquiroga.movies.core.constants.Image
import com.jquiroga.movies.core.extensions.loadImage
import com.jquiroga.movies.databinding.ItemPopularMovieBinding
import com.jquiroga.movies.features.popular.model.MovieModel

class PopularMovieAdapter : RecyclerView.Adapter<PopularMovieAdapter.PopularMovieViewHolder>() {

    private val movieList = mutableListOf<MovieModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PopularMovieViewHolder(
            ItemPopularMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PopularMovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount() = movieList.size

    fun addMovies(movies: List<MovieModel>) {
        movieList.addAll(movies)
        notifyDataSetChanged()
    }

    inner class PopularMovieViewHolder(private val binding: ItemPopularMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieModel) {
            binding.run {
                imageMovie.loadImage(Image.BASE_URL_IMAGE + movie.posterPath)
                textTitle.text = movie.title
                textOverview.text = movie.overview
            }
        }
    }

}