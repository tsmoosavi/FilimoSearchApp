package com.example.filimosearchapp.di

import okhttp3.Interceptor
import okhttp3.Response


class HeaderInterceptor: Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.addHeader("jsonType" , "simple")
        return chain.proceed(requestBuilder.build())
    }
}