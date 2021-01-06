package com.ayush.instagramclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayush.instagramclone.R
import com.ayush.instagramclone.model.Feed
import com.bumptech.glide.Glide

class FeedAdapter (
    val FeedData:ArrayList<Feed>,
    val context: Context
): RecyclerView.Adapter<FeedAdapter.PostViewHolder>(){
    class PostViewHolder(view: View): RecyclerView.ViewHolder(view){
        val Username: TextView
        val Profile: ImageView
        val Photo: ImageView
        init {
            Username= view.findViewById(R.id.Username)
            Profile= view.findViewById(R.id.Profile)
            Photo= view.findViewById(R.id.Photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.feed_layout, parent, false)
        return FeedAdapter.PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val FeedData = FeedData[position]
        holder.Username.text = FeedData.Username.toString()
        Glide.with(context)
            .load(FeedData.Profile)
            .into(holder.Profile)
        Glide.with(context)
            .load(FeedData.Photo)
            .into(holder.Photo)
    }

    override fun getItemCount(): Int {
        return FeedData.size
    }
}