package com.maple.aenzz_poject1.Splash.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.maple.aenzz_poject1.R
import com.maple.aenzz_poject1.Splash.framelayoutfragments.HomeFragment
import com.maple.aenzz_poject1.Splash.framelayoutfragments.ProfileFragment
import com.maple.aenzz_poject1.Splash.framelayoutfragments.SettingFragment
import com.maple.aenzz_poject1.databinding.ActivityBottomNavigationBinding

class BottomNavigation : AppCompatActivity() {
    private lateinit var binding: ActivityBottomNavigationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFrame(HomeFragment())

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.home -> replaceFrame(HomeFragment())
                R.id.profile -> replaceFrame(ProfileFragment())
                R.id.setting -> replaceFrame(SettingFragment())
                else -> {

                }
            }
            true

        }

    }

    private fun replaceFrame(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

}