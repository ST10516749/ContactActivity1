package com.example.contactactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val studentAge = 21

        // Years until student turns 100
        val yearsTo100 = 100 - studentAge

        // Age in months
        val ageInMonths = studentAge * 12

        // Age in days (skip leap years, use 365 days)
        val ageInDays = studentAge * 365

        // Reminder when age divided by 5
        val remainderBy5 = studentAge * 0.5
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}