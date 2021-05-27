package com.jquiroga.data.core.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.jquiroga.data.BuildConfig
import com.jquiroga.data.datasource.remote.api.MovieApi
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

@ExperimentalSerializationApi
object ApiClient {

    private const val CONNECTION_TIMEOUT: Long = 30L
    private const val READ_TIMEOUT: Long = 30L
    private const val WRITE_TIMEOUT: Long = 30L

    private const val BASE_URL = "https://api.themoviedb.org/3/movie/"

    private val CONTENT_TYPE_JSON = "application/json".toMediaType()

    private val jsonConfiguration = Json {
        ignoreUnknownKeys = true
    }

    private fun getLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }

    private fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(HeaderInterceptor())
            .addInterceptor(getLoggingInterceptor())
            .build()
    }

    fun createRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(jsonConfiguration.asConverterFactory(CONTENT_TYPE_JSON))
            .client(createOkHttpClient())
            .build()
    }

    inline fun <reified T> provideApi(): T {
        return createRetrofit().create(T::class.java)
    }

}

