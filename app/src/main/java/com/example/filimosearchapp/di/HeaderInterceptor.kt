package com.example.filimosearchapp.di

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject


class HeaderInterceptor @Inject constructor(): Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.addHeader("jsonType" , "simple")
        return chain.proceed(requestBuilder.build())
    }
}