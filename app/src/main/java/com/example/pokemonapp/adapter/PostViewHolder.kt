package com.example.pokemonapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.Post
import com.example.pokemonapp.R

class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun onBind(post: Any) {

    }

    val imgPokemon = itemView.findViewById<ImageView>(R.id.imgurl)
    val namePokemon = itemView.findViewById<TextView>(R.id.nameid)

}