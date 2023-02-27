package com.example.mobileapps1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val nameArray = Array(50) { "Name $it" }
        val phoneArray = Array(50) { "${it * 10}" }
        recyclerView.adapter = ContactAdapter(nameArray, phoneArray)

//        recyclerView.adapter = ArrayAdapter(this, R.layout.list_view_template, phoneArray)
//        recyclerView.setOnItemClickListener { parent, view, position, id ->
//            val textView = view.findViewById<TextView>(R.id.text_view)
//            Toast.makeText(this, "$position $id ${textView.text}", Toast.LENGTH_LONG).show()
//        }

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}