package com.example.main.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Session(
    val sessionId: String? = null
): Parcelable