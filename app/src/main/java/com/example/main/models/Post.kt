package com.example.main.models

import com.google.gson.annotations.SerializedName

data class Post(
    var userId: Int? = null,
    var id: Int? = null,
    var title: String? = null,
    var body: String? = null)