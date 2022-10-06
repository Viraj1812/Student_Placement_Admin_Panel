package com.example.studentplacementadminpanel.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studentplacementadminpanel.R
import com.example.studentplacementadminpanel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}