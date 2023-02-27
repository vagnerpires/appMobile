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
        val contactArray = Array(50) { Contact("Name $it", "${it * 10}") }
        recyclerView.adapter = ContactAdapter(contactArray)

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