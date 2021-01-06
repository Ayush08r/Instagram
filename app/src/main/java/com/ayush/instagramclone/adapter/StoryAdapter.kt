package com.ayush.instagramclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayush.instagramclone.R
import com.ayush.instagramclone.model.user
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class StoryAdapter(
    val Userdata:ArrayList<user>,
    val context: Context
): RecyclerView.Adapter<StoryAdapter.StoryViewHolder>()
{
    class StoryViewHolder(
        view: View
    ): RecyclerView.ViewHolder(view){
        val imageStory: CircleImageView
        val UserStoryName: TextView
        init {
            imageStory= view.findViewById(R.id.Story)
            UserStoryName= view.findViewById(R.id.storyName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.story_layout, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val userdata = Userdata[position]
        holder.UserStoryName.text = userdata.Fname.toString()
        Glide.with(context)
            .load(userdata.profile)
            .into(holder.imageStory)
    }

    override fun getItemCount(): Int {
        return Userdata.size
    }

}