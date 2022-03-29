package com.example.m5_l5ebayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l5ebayui.R
import com.example.m5_l5ebayui.model.Favorite

class FavoriteAdapter(val context: Context, val items: ArrayList<Favorite>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_favorite, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is StoryViewHolder) {
            holder.apply {
                tvTitle.text = item.title
                ivImage.setImageResource(item.image)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class StoryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val ivImage = view.findViewById<ImageView>(R.id.iv_image)
        val tvTitle = view.findViewById<TextView>(R.id.tv_title)
    }

}