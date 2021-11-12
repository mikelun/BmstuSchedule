package com.example.main.di

import com.example.main.network.model.ResultDtoMapper
import com.example.main.network.service.ResultService
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton
import dagger.Provides as Provides


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideResultMapper(): ResultDtoMapper {
        return ResultDtoMapper()
    }

    @Singleton
    @Provides
    fun provideResultService(): ResultService {
        return Retrofit.Builder()
            .baseUrl("http://bmstu.romanqed.keenetic.pro/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(ResultService::class.java)
    }

    @Singleton
    @Provides
    @Named("sessionId")
    fun provideSessionId(): String {
        return ""
    }
}