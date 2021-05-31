package com.jquiroga.movies.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class CoreModule {

    @Provides
    @Singleton
    fun provideDefaultDispatcher() : CoroutineDispatcher {
        return Dispatchers.IO
    }
}

