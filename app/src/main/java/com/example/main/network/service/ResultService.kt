package com.example.main.network.service

import com.example.main.network.model.ResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ResultService {
    @GET("schedule")
    suspend fun schedule(
        @Query("session_id") sessionId: String,
        @Query("week_type") weekType: Int
    ): ResultDto
}