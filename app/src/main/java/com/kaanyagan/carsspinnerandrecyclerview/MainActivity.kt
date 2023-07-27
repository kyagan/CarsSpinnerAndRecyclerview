package com.kaanyagan.carsspinnerandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kaanyagan.carsspinnerandrecyclerview.Database.cars

class MainActivity : AppCompatActivity() {

    lateinit var spCars:Spinner
    lateinit var rvCars:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spCars = findViewById(R.id.spCars)
        rvCars = findViewById(R.id.rvCars)

        spCars.adapter = CustomSpinnerAdapter(this, cars)

        rvCars.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvCars.adapter = CustomCarAdapter(this, cars)


    }
}