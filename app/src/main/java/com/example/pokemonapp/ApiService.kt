package com.example.pokemonapp

import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPost(): List<Post>
}