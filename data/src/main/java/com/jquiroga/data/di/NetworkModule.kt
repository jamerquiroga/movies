package com.jquiroga.data.di

import com.jquiroga.data.core.network.ApiClient
import com.jquiroga.data.datasource.remote.api.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideMovieApi() : MovieApi {
        return ApiClient.provideApi()
    }

}