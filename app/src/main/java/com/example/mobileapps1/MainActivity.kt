package com.example.mobileapps1

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val rootView = window.decorView.rootView
        val rootView = findViewById<View>(R.id.root_layout)

        val helloText = findViewById<TextView>(R.id.welcomeText)
        helloText.text = getString(R.string.hello_dorset)

        val welcomeText = findViewById<TextView>(R.id.welcomeNameText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val nameText = nameEditText.text


        saveButton.setOnClickListener {
            val welcomeTextString = "Welcome, $nameText!"
            welcomeText.text = welcomeTextString
            it.hideKeyboard()
            Toast.makeText(this, "Save button clicked", Toast.LENGTH_LONG).show()
            val sb = Snackbar.make(rootView, "Save button clicked", Snackbar.LENGTH_INDEFINITE)
            sb.setAction("dismiss") {
                sb.dismiss()
            }
            sb.show()

            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    val bundle = bundleOf("username" to "Inside fragment: $nameText")
                    setReorderingAllowed(true)
                    add<SampleFragment>(R.id.fragment_container_view, args = bundle)
                }
            }

            Log.i("MainAct", "Text entered $nameText")
            if (nameText.toString() == "Hide") {
                Log.i("MainAct", "Inside Hide if")
                saveButton.visibility = View.GONE
            }
        }

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://github.com/saravanabalagi/dorset_mobileApps1")
            }
            startActivity(intent)
        }

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    fun View.hideKeyboard() {
        val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(windowToken, 0)
    }


}