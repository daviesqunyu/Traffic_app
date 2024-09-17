package com.example.helloapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Apply window insets to handle padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Button: Open Maps
        val buttonMap = findViewById<Button>(R.id.button_map)
        buttonMap.setOnClickListener {
            Toast.makeText(this, "Opening Maps...", Toast.LENGTH_SHORT).show()
            // Code to open Maps activity or integrate with Google Maps API goes here
        }

        // Button: Check Traffic Status
        val buttonTrafficStatus = findViewById<Button>(R.id.button_traffic_status)
        buttonTrafficStatus.setOnClickListener {
            Toast.makeText(this, "Checking Traffic Status...", Toast.LENGTH_SHORT).show()
            // Code to display traffic status or make API call goes here
        }

        // Button: Start Navigation
        val buttonNavigation = findViewById<Button>(R.id.button_navigation)
        buttonNavigation.setOnClickListener {
            Toast.makeText(this, "Starting Navigation...", Toast.LENGTH_SHORT).show()
            // Code to start navigation or link with GPS Navigation API goes here
        }
    }
}
