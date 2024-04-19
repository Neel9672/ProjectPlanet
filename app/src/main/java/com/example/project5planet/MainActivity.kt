package com.example.project5planet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        //data source
        val planet1 = planet("Mercury", "0 Moons",  R.drawable.planet)
        val planet2 = planet("Venus", "0 Moons",  R.drawable.planet)
        val planet3 = planet("Earth", "1 Moons",  R.drawable.planet)
        val planet4 = planet("Mars", "2 Moons",  R.drawable.planet)
        val planet5 = planet("Jupiter", "79 Moons",  R.drawable.planet)
        val planet6 = planet("Saturn", "83 Moons",  R.drawable.planet)
        val planet7 = planet("Uranus", "27 Moons",  R.drawable.planet)
        val planet8 = planet("Neptune", "14 Moons",  R.drawable.planet)

        var planetList = ArrayList<planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)

        var adapter = MyCustomAdapter(this, planetList)

        listView.adapter = adapter





    }
}