package com.example.youtube_app.service

import com.example.youtube_app.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/cb009888-1e8a-42ce-b353-a200dc3942ed")
    fun listVideos(): Call<VideoDto>
}