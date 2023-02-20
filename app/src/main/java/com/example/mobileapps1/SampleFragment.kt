package com.example.mobileapps1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class SampleFragment : Fragment(R.layout.fragment_sample) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentText = view.findViewById<TextView>(R.id.fragment_text)

//        equivalent of savedInstanceState?.
//        if (savedInstanceState != null) {
//            savedInstanceState.apply {  }
//        }

        Log.i("SampleFragment", "Before applying bundle values")

        arguments?.apply {
//            val i = getInt("page_number")
            val t = getString("description")
            fragmentText.text = t
            Log.i("SampleFragment", "Applying bundle values")
        }
//        fragmentText.text = "Altered text"
    }
}