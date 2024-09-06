package com.example.pokemonapp

import retrofit2.http.GET

interface ApiService {
     @GET "pokemon"
    Call <Post>
}