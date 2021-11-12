package com.example.main.repository

import com.example.main.domain.model.Result

interface ResultRepository {
    suspend fun schedule(sessionId: String, weekType: Int): Result
}