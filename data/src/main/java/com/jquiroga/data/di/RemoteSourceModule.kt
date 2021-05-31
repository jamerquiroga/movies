package com.jquiroga.data.di

import com.jquiroga.data.datasource.remote.source.abstraction.MovieRemoteSource
import com.jquiroga.data.datasource.remote.source.implementation.MovieRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RemoteSourceModule {

    @Binds
    abstract fun provideMovieRemoteSource(implement: MovieRemoteDataSource): MovieRemoteSource

}