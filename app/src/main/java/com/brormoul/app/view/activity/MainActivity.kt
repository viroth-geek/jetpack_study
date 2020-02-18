package com.brormoul.app.view.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.brormoul.app.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.navigation_host_fragment) as NavHostFragment? ?: return
        val navController = host.navController
        appBarConfiguration = AppBarConfiguration(navController.graph)

        setUpBottomNavigation(navController)
        setUpActionBar(applicationContext, navController, appBarConfiguration)


    }

    private fun setUpBottomNavigation(navigation: NavController) {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView?.setupWithNavController(navigation)
    }

    private fun setUpActionBar(context: Context,navController : NavController, appBarConfig: AppBarConfiguration) {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

//        toolbar.apply {
//            setNavigationIcon(R.drawable.ic_back)
//            setupWithNavController(navController)
//            setTitleTextColor(ContextCompat.getColor(context, R.color.colorWhite))
//            appBarConfiguration
//        }

    }

}
