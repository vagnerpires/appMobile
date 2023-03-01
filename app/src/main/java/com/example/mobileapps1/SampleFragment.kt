package com.example.mobileapps1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso

class SampleFragment : Fragment(R.layout.fragment_sample) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentText = view.findViewById<TextView>(R.id.fragmentText)
        val fragmentImage = view.findViewById<ImageView>(R.id.fragmentImage)
        arguments?.apply {
            getString("username")?.apply {
                fragmentText.text = this
            }
            getString("imageUrl")?.apply {
                Log.i("SampleFrag", "Before loading image")
                Picasso.get().load(this).into(fragmentImage)
            }
        }
    }
}