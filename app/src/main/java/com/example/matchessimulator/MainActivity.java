package com.example.matchessimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.matchessimulator.databinding.ActivityMainBinding;

import org.jetbrains.annotations.Nullable;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}