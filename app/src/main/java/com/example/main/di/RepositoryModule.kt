package com.example.main.di

import com.example.main.network.model.ResultDtoMapper
import com.example.main.network.service.ResultService
import com.example.main.repository.ResultRepository
import com.example.main.repository.ResultRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideResultRepository(
        resultService: ResultService,
        resultDtoMapper: ResultDtoMapper
    ): ResultRepository {
        return ResultRepositoryImpl(resultService, resultDtoMapper)
    }
}