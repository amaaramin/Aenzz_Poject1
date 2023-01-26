package com.maple.aenzz_poject1.git_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maple.aenzz_poject1.databinding.ActivityLearningBinding

class LearningActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLearningBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearningBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}