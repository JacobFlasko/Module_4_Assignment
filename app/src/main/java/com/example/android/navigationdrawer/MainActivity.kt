package com.example.android.navigationdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.ui.AppBarConfiguration
import com.example.android.navigationdrawer.ui.theme.NavigationDrawerTheme

class MainActivity : AppCompatActivity() {


    private lateinit var appBarConfiguration: AppBarConfiguration


    @override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        ///

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        val navView: NavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each

        // menu should be considered as top level destinations.

        appBarConfiguration = AppBarConfiguration(setOf(

            R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow), drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)

        navView.setupWithNavController(navController)

    }

    private fun setupActionBarWithNavController(navController: Any, appBarConfiguration: Any) {

    }

    private fun setSupportActionBar(toolbar: Any) {

    }

    private fun setContentView(activityMain: Any) {

    }

    @override fun onSupportNavigateUp(): Boolean {

        val navController = findNavController(R.id.nav_host_fragment)

        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

    }

}

annotation class override

open class AppCompatActivity {
    fun onCreate(savedInstanceState: Bundle?) {

    }

}

