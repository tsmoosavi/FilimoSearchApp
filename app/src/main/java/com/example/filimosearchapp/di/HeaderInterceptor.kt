package com.example.filimosearchapp.di

import com.example.filimosearchapp.data.MovieRepository
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor: Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuiler = chain.request().newBuilder()
        requestBuiler.addHeader("jsonType" , "simple")
        return chain.proceed(requestBuiler.build())
    }
}