package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    private val _tag = "main_activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(_tag, "Activity created")
    }

    override fun onPause() {
        super.onPause()
        Log.w(_tag, "Activity has been paused")
    }

    override fun onResume() {
        super.onResume()
        Log.e(_tag, "This activity has been resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(_tag, "Activity has been destroyed")
    }
}