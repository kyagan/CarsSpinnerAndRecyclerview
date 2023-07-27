package com.kaanyagan.carsspinnerandrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomCarAdapter(val context:Context, val cars:List<Car>): RecyclerView.Adapter<CustomCarAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_recyclerview_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val car = cars[position]
        holder.ivCar.setBackgroundResource(car.logo)
        holder.tvCar.text = car.name
    }

    class CustomViewHolder(itemView:View):ViewHolder(itemView){
        val ivCar = itemView.findViewById<ImageView>(R.id.ivCar)
        val tvCar = itemView.findViewById<TextView>(R.id.tvCar)

    }
}