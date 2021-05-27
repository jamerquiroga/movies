package com.jquiroga.data.core.network

import retrofit2.HttpException
import retrofit2.Response

suspend fun <T : Any> safeApiCall(bock: suspend () -> Response<T>): T? {
    try {
        val response = bock.invoke()
        if (response.isSuccessful) {
            return response.body()
        } else {
            throw HttpException(response)
        }
    } catch (e: Throwable) {
        e.printStackTrace()
        throw e.buildFailure()
    }
}

internal fun Throwable.buildFailure() = FailureHandler().build(this)