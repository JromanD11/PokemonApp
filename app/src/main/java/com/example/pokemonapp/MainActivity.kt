package com.example.pokemonapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pokemonapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun getImagesFromPicasso(){
        // pasar lo que llegue del api en el parametro sprites front_default a la dataClass Post

    }

    private fun fetchData(){
        CoroutineScope(Dispatchers.IO).launch {
            val post = RetrofitInstance.api.getPost()
            withContext(Dispatchers.Main){

                ///adapter y recyclerView

        }

        }
    }

}