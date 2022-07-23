package com.example.week05day04hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
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
        setupDrawer()
    }

    private fun connectViews() {
        drawerLayout = findViewById(R.id.drawer_layout_activity_main)
        navigationView = findViewById(R.id.nav_view_activity_main)
        toolbar = findViewById(R.id.toolbar_activity_main)
    }

    private fun setupDrawer() {
        val toggleDrawer:ActionBarDrawerToggle = ActionBarDrawerToggle(this,
            drawerLayout, R.string.open, R.string.close)

        drawerLayout?.addDrawerListener(toggleDrawer)
        toggleDrawer.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                drawerLayout?.openDrawer(GravityCompat.START)
                true
            }
            else -> true
        }
    }
}