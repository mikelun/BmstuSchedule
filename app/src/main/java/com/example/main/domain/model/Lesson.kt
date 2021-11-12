package com.example.main.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Lesson(
    val subjectId: String? = null,
    val type: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val day: Int? = null,
    val location: String? = null
): Parcelable
