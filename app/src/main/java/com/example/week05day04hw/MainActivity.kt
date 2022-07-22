package com.example.week05day04hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private var drawerLayout:DrawerLayout? = null
    private var navigationView:NavigationView? = null
    private var toolbar:Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
    }

    private fun connectViews() {
        drawerLayout = findViewById(R.id.drawer_layout_activity_main)
        navigationView = findViewById(R.id.nav_view_activity_main)
        toolbar = findViewById(R.id.toolbar_activity_main)
    }
}