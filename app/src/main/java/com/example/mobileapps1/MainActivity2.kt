package com.example.mobileapps1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener {

//            this creates new activity even if it exists in the stack
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)

//            do not use onDestroy to end an activity
//            onDestroy()
            finish()
        }
    }

    // deprecated, will be removed in the future versions of Android SDK
    @Deprecated("Only for learning purposes")
    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("m2", "Back button pressed")
    }
}