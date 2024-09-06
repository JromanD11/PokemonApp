package com.example.pokemonapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.Post
import com.example.pokemonapp.R

class PostAdapter ( private val post: List<Post>): RecyclerView.Adapter<PostViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return post.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = post [position]
        holder.render(post)
    }

}