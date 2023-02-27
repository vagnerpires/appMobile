package com.example.mobileapps1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contactArray: Array<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_template, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactArray.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = contactArray[position].name
        holder.phoneTextView.text = contactArray[position].phone
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView
        val phoneTextView: TextView
        init {
            // Define click listener for the ViewHolder's View
            nameTextView = view.findViewById(R.id.nameTextView)
            phoneTextView = view.findViewById(R.id.phoneTextView)
        }
    }
}