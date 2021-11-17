package com.example.winwinapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.winwinapp.R
import com.example.winwinapp.databinding.SplashScreenBinding
import com.example.winwinapp.ui.loginSignup.LoginSignUpActivity

class LaunchActivity : AppCompatActivity() {

    private lateinit var binding: SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpViews()
        supportActionBar?.hide()
    }

    private fun setUpViews() {
        binding.btnBuyProducts.setOnClickListener {
            val intent = Intent(this, LoginSignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}