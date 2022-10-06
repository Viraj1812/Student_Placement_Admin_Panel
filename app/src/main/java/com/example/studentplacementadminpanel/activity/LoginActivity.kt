package com.example.studentplacementadminpanel.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studentplacementadminpanel.R
import com.example.studentplacementadminpanel.databinding.ActivityLoginBinding
import com.example.studentplacementadminpanel.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}