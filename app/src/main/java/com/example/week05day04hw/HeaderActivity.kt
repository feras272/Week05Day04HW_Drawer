package com.example.week05day04hw

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HeaderActivity : AppCompatActivity() {

    private var imageButtonUser:ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.header)

//        connectViews()
//        imageButtonClick()

    }

    private fun connectViews() {
        imageButtonUser = findViewById(R.id.ib_user_header)
    }

    private fun imageButtonClick() {
        imageButtonUser?.setOnClickListener {
            Toast.makeText(this, "User image has clicked", Toast.LENGTH_SHORT).show()
        }
    }

}