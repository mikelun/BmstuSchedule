package com.example.main.network.model

import com.google.gson.annotations.SerializedName

data class SubjectDto(
    @SerializedName("_id")
    val subjectId : String? = null,

    @SerializedName("title")
    val name : String? = null,
)
