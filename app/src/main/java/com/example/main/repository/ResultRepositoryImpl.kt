package com.example.main.repository

import com.example.main.domain.model.Result
import com.example.main.network.model.ResultDtoMapper
import com.example.main.network.service.ResultService

class ResultRepositoryImpl
constructor(
    private val resultService: ResultService,
    private val mapper: ResultDtoMapper
): ResultRepository {
    override suspend fun schedule(sessionId: String, weekType: Int): Result {
        return mapper.mapToDomainModel(resultService.schedule(sessionId = sessionId, weekType = weekType))
    }
}