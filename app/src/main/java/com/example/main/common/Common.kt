package com.example.main.common

import com.example.main.models.RetrofitClient
import com.example.main.models.RetrofitServices

object Common {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}