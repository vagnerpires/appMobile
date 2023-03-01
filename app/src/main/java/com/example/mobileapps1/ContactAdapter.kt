package com.example.mobileapps1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(private val contactArray: Array<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_template, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactArray.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = contactArray[position].name
        holder.phoneTextView.text = contactArray[position].phone
//        val imgNumber = Random.nextInt(3500, 3600)
        val imgNumber = 3530 + position
        val url = "https://thispersondoesnotexist.xyz/img/$imgNumber.jpg"
        Picasso.get()
            .load(url)
//            .memoryPolicy(MemoryPolicy.NO_CACHE)
            .into(holder.contactImageView)
        if (position == 2) {
            contactArray[2].name = "John Doe"
            holder.nameTextView.text = contactArray[position].name
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView
        val phoneTextView: TextView
        val contactImageView: ImageView
        init {
            // Define click listener for the ViewHolder's View
            nameTextView = view.findViewById(R.id.nameTextView)
            phoneTextView = view.findViewById(R.id.phoneTextView)
            contactImageView = view.findViewById(R.id.contactImage)
        }
    }
}