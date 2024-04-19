package com.example.project5planet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MyCustomAdapter(val context: Context, val planets: List<planet>): BaseAdapter() {
    override fun getCount(): Int {
       return planets.size
    }

    override fun getItem(position: Int): Any {
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE
        ) as LayoutInflater

        val view: View

        if (convertView == null){
            view = inflater.inflate(R.layout.my_custom_layout, parent, false)
        }
        else{
            view = convertView
        }

        val item = getItem(position) as planet

        val titleTextView = view.findViewById<TextView>(R.id.planetName)
        val  moonCount = view.findViewById<TextView>(R.id.moonCount)
        val moonImage = view.findViewById<ImageView>(R.id.imageView)

        titleTextView.text = item.title
        moonImage.setImageResource(item.image)
        moonCount.text = item.moon

        view.setOnClickListener {
            Toast.makeText(context, "You clicked ${planets[position].title}", Toast.LENGTH_SHORT).show()
        }

        return view

    }
}