package com.example.mobileapps1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class SampleFragment : Fragment(R.layout.fragment_sample) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentText = view.findViewById<TextView>(R.id.fragment_text)
        arguments?.apply {
            val t = getString("username")
            fragmentText.text = t
        }
    }
}