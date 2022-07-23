package com.example.week05day04hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
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

        setSupportActionBar(toolbar!!)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupDrawer()
        drawerClicks()
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

    private fun drawerClicks() {
        navigationView?.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.camera_import -> {
                    Toast.makeText(this, "Import button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.gallery -> {
                    Toast.makeText(this, "Gallery button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.subscribe -> {
                    Toast.makeText(this, "Subscribe button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.tools -> {
                    Toast.makeText(this, "Tools button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.share -> {
                    Toast.makeText(this, "Share button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.send -> {
                    Toast.makeText(this, "Send button has clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout?.closeDrawer(GravityCompat.START)
                    true
                }
                else -> true
            }
        }
    }

}