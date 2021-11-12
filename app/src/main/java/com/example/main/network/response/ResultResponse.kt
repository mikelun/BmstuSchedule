package com.example.main.network.response

import com.example.main.network.model.LessonDto
import com.example.main.network.model.SubjectDto
import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("result")
    val result: Result? = null
)

data class Result(
    @SerializedName("schedule")
    val schedule: List<LessonDto>? = null,

    @SerializedName("subjects")
    val subjects: List<SubjectDto>? = null,
)