package com.example.main.network.model

import com.google.gson.annotations.SerializedName

data class ResultDto (
    @SerializedName("result")
    val result: ResultElements ?= null
)

data class ResultElements(
    @SerializedName("schedule")
    val schedule: List<LessonDto>? = null,

    @SerializedName("subjects")
    val subjects: List<SubjectDto>? = null,
)