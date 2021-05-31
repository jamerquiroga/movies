package com.jquiroga.data.di

import com.jquiroga.data.repository.MovieDataRepository
import com.jquiroga.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideMovieRepository(implement: MovieDataRepository): MovieRepository

}