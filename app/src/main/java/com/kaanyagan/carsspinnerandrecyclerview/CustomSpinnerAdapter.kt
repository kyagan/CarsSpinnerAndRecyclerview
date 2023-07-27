package com.kaanyagan.carsspinnerandrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinnerAdapter(val context:Context, val cars:List<Car>):BaseAdapter() {
    override fun getCount(): Int {
        return cars.size
    }

    override fun getItem(p0: Int): Any {
        return cars[p0]
    }

    override fun getItemId(p0: Int): Long {
        return cars[p0].id.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_spinner,p2,false)
        val ivCar = view.findViewById<ImageView>(R.id.ivCar)
        val tvCar = view.findViewById<TextView>(R.id.tvCar)

        ivCar.setBackgroundResource(cars[p0].logo)
        tvCar.text = cars[p0].name

        return view
    }


}