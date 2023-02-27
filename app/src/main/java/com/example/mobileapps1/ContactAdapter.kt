package com.example.mobileapps1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val nameArray: Array<String>): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_template, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nameArray.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val textView = holder.itemView.findViewById<TextView>(R.id.text_view)
        textView.text = nameArray[position]
    }
}

class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)