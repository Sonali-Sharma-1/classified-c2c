package com.example.winwinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.winwinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setUpNav()
    }

    private fun setUpNav() {
        val navFragment =
            supportFragmentManager.findFragmentById(R.id.home_nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.homeBottomNavigation, navFragment.navController)

        navFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> setBottomNavVisibility(View.VISIBLE)
                R.id.categoryFragment -> setBottomNavVisibility(View.VISIBLE)
                R.id.myOrderFragment -> setBottomNavVisibility(View.VISIBLE)
                R.id.fPayFragment -> setBottomNavVisibility(View.VISIBLE)
                R.id.moreFragment -> setBottomNavVisibility(View.VISIBLE)
                else -> setBottomNavVisibility(View.GONE)
            }
        }
    }

    private fun setBottomNavVisibility(visibility: Int) {
        binding.homeBottomNavigation.visibility = visibility
    }
}