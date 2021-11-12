package com.example.main.models

import retrofit2.http.GET
import retrofit2.Call

public interface RetrofitServices {
    @GET("posts")
    fun getPosts(): Call<MutableList<Post>>
}