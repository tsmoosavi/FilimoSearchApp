package com.example.filimosearchapp.di

import com.example.filimosearchapp.BuildConfig
import com.example.filimosearchapp.data.ApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn
@Module
object AppModule {

    @Singleton
    @Provides
    fun getMoshi(): Moshi {
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        return moshi
    }

    @Singleton
    @Provides
    fun getStatus(headerInterceptor: HeaderInterceptor): OkHttpClient {
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        val client = OkHttpClient.Builder().addInterceptor(headerInterceptor)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG){
            client.addInterceptor(logger)
        }
        return client.build()
    }

    @Singleton
    @Provides
    fun getRetrofit(moshi: Moshi, client: OkHttpClient): Retrofit {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl("https://www.filimo.com/api/en/v1/movie/movie/list/tagid/1000300/text/{Query}/sug/on")
            .client(client)
            .build()
        return retrofit
    }

    @Singleton
    @Provides
    fun getApiService(retrofit: Retrofit): ApiService {
        val productsApiService = retrofit.create(ApiService::class.java)
        return productsApiService
    }
}

