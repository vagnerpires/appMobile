package com.example.mobileapps1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener {

//            this creates new activity even if it exists in the stack
            val intent = Intent(this, MainActivity::class.java)
//                 https://developer.android.com/guide/components/activities/tasks-and-back-stack
//                .apply {
//                  flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
//                 }
            startActivity(intent)

//            do not use onDestroy to end an activity
//            onDestroy()
//            finish()
        }
    }
}