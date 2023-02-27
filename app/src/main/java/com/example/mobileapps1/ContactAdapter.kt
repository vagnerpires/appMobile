package com.example.mobileapps1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val nameArray: Array<String>, val phoneArray: Array<String>): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        Log.i("ContactRecyclerView", "Created new viewHolder")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_template, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nameArray.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        Log.i("ContactRecyclerView", "$position")
        val nameTextView = holder.itemView.findViewById<TextView>(R.id.nameTextView)
        val phoneTextView = holder.itemView.findViewById<TextView>(R.id.phoneTextView)
        nameTextView.text = nameArray[position]
        phoneTextView.text = phoneArray[position]
    }
}

class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)