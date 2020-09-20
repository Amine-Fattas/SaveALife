package com.impression.savealife.services

import com.impression.savealife.models.Post
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostServices {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @POST("add")
    fun addPost(@Body post: Post): Call<Post>
}