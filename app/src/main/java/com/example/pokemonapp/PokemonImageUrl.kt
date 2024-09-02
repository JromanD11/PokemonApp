package com.example.pokemonapp

import com.google.gson.annotations.SerializedName

data class PokemonImageUrl(
    @SerializedName("front_default")
    val imageUrl: String
)
