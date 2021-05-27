package com.jquiroga.data.core.network

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.addHeader(AUTHORIZATION, API_KEY)
        return chain.proceed(requestBuilder.build())
    }

    internal companion object {
        private const val AUTHORIZATION = "Authorization"
        private const val API_KEY =
            "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyNmYzNDhlNzQ1NjZjMDJjZTQzZWU1M2MwODBiZmIwMyIsInN1YiI6IjVjNjA3ZWEwOTI1MTQxNDIwNmI3Mjc3NyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.XsoOOUi_l78xmhf2PCmijJmqaGI54z2yFLXStx8NVaQ"
    }
}