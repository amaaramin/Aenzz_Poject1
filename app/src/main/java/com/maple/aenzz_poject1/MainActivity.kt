package com.maple.aenzz_poject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.maple.aenzz_poject1.databinding.ActivityMainBinding
import com.maple.aenzz_poject1.databinding.Layout1Binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.image1.setOnClickListener {
            val bottomSheet = BottomSheetDialog(this)
            val first : Layout1Binding = Layout1Binding.inflate(layoutInflater)
            bottomSheet.setContentView(first.root)
            bottomSheet.show()
        }
    }
}