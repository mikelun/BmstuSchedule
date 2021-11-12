package com.example.main.network.model

import com.google.gson.annotations.SerializedName

data class LessonDto(
    @SerializedName("subject_id")
    var subjectId: String? = null,

    @SerializedName("type")
    var type: String? = null,

    @SerializedName("start_time")
    var startTime: String? = null,

    @SerializedName("end_time")
    var endTime: String? = null,

    @SerializedName("day")
    var day: Int? = null,

    @SerializedName("location")
    var location: String? = null,
)