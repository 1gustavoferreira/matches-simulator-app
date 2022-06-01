package com.example.matchessimulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.matchessimulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}