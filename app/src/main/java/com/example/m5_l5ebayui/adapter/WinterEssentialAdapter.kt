package com.example.m5_l5ebayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l5ebayui.R
import com.example.m5_l5ebayui.model.WinterEssential

class WinterEssentialAdapter(val context: Context, val items: ArrayList<WinterEssential>):
    RecyclerView.Adapter<WinterEssentialAdapter.WinterEssentialViewHolder>() {



    class WinterEssentialViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivEssential = view.findViewById<ImageView>(R.id.iv_essential)
        val tvEssential = view.findViewById<TextView>(R.id.tv_essential)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WinterEssentialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_winter_essential, parent, false)
        return WinterEssentialViewHolder(view)
    }

    override fun onBindViewHolder(holder: WinterEssentialViewHolder, position: Int) {
        val item = items[position]

        holder.apply {
            ivEssential.setImageResource(item.image)
            tvEssential.text = item.name

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


}