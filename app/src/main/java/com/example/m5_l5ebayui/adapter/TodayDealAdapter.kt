package com.example.m5_l5ebayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l5ebayui.R
import com.example.m5_l5ebayui.model.TodayDeal


class TodayDealAdapter(val context: Context, val items: ArrayList<TodayDeal>): RecyclerView.Adapter<TodayDealAdapter.DealViewHolder>(){

    class DealViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val ivProduct = view.findViewById<ImageView>(R.id.iv_product)
        val tvName = view.findViewById<TextView>(R.id.tv_name_product)
        val price = view.findViewById<TextView>(R.id.tv_price_product)
        val oldPrice = view.findViewById<TextView>(R.id.tv_old_price)
        val percentage = view.findViewById<TextView>(R.id.tv_percentage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_today_deal, parent, false)
       return DealViewHolder(view)
    }

    override fun onBindViewHolder(holder: DealViewHolder, position: Int) {
        val item = items[position]

        holder.apply {
            ivProduct.setImageResource(item.image)
            tvName.text = item.name
            price.text = item.price
            oldPrice.text = item.oldPrice
            percentage.text = item.percentage

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}