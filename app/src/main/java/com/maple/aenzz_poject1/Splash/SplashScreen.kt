package com.maple.aenzz_poject1.Splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.maple.aenzz_poject1.MainActivity
import com.maple.aenzz_poject1.R
import com.maple.aenzz_poject1.databinding.ActivitySplashScreenBinding
import com.maple.aenzz_poject1.Splash.framelayout.BottomNavigation

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, BottomNavigation::class.java)
            startActivity(intent)
            finish()

        },3000
        )

    }
}