package com.example.m5_l5ebayui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l5ebayui.model.Favorite
import com.example.m5_l5ebayui.adapter.FavoriteAdapter
import com.example.m5_l5ebayui.R
import com.example.m5_l5ebayui.adapter.TodayDealAdapter
import com.example.m5_l5ebayui.adapter.WinterEssentialAdapter
import com.example.m5_l5ebayui.model.TodayDeal
import com.example.m5_l5ebayui.model.WinterEssential

class MainActivity : AppCompatActivity() {

    private lateinit var rvFavorites:RecyclerView
    private lateinit var rvTodayDeal:RecyclerView
    private lateinit var rvWinterEssential:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        rvFavorites = findViewById(R.id.rv_favorites)
        rvTodayDeal = findViewById(R.id.rv_today_deal)
        rvWinterEssential = findViewById(R.id.rv_winter_essential)

        rvFavorites.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvTodayDeal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvWinterEssential.layoutManager = GridLayoutManager(this, 3)


        refreshFavoriteAdapter(getFavorites())
        refreshTodayDealAdapter(getTodayDeal())
        refreshWinterEssentialAdapter(getWinterEssential())
    }

    private fun getFavorites(): ArrayList<Favorite> {
        val list = ArrayList<Favorite>()
        for (i in 0..10) {
            list.add(Favorite("Apple Watch", R.drawable.watch))
            list.add(Favorite("Apple Watch", R.drawable.watch))
            list.add(Favorite("Apple Watch", R.drawable.watch))
            list.add(Favorite("Apple Watch", R.drawable.watch))
        }
        return list
    }

    private fun getTodayDeal(): ArrayList<TodayDeal>{
        val list = ArrayList<TodayDeal>()

        for (i in 0..20) {
            list.add(TodayDeal(R.drawable.im_airdots, "Bose QuietComfort Earbuds", "$199.00", "$279.00", "29%"))
        }
        return list
    }

    private fun getWinterEssential(): ArrayList<WinterEssential>{
        val list = ArrayList<WinterEssential>()
        list.add(WinterEssential(R.drawable.im_blanket, "Blankets"))
        list.add(WinterEssential(R.drawable.im_heater, "Heaters"))
        list.add(WinterEssential(R.drawable.im_thermostats, "Thermostats"))
        list.add(WinterEssential(R.drawable.img, "Generators"))
        list.add(WinterEssential(R.drawable.im_snow_blowers, "Snowblowers"))
        list.add(WinterEssential(R.drawable.im_snow_showel, "Snow shovels"))
        return list
    }

    private fun refreshFavoriteAdapter(favorites: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, favorites)
        rvFavorites.adapter = adapter

    }

    private fun refreshTodayDealAdapter(items:ArrayList<TodayDeal>) {
        val adapter = TodayDealAdapter(this, items)
        rvTodayDeal.adapter = adapter
    }

    private fun refreshWinterEssentialAdapter(items:ArrayList<WinterEssential>) {
        val adapter = WinterEssentialAdapter(this, items)
        rvWinterEssential.adapter = adapter
    }
}