package com.example.simplefoodorderingapp

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This line tells Android to use the XML layout file
        setContentView(R.layout.activity_main)
    }
}