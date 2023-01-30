package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = getString(R.string.some_text)

        val myTextView2 = findViewById<TextView>(R.id.myTextView2)
        val newTextString2 = getString(R.string.some_text) + "123 "
        myTextView2.text = newTextString2

        val myTextView3 = findViewById<TextView>(R.id.myTextView3)
        val newTextString3 = getString(R.string.some_text) + "123 "
        myTextView3.text = newTextString3

    }
}