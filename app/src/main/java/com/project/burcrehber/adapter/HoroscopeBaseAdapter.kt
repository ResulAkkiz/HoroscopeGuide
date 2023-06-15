package com.project.burcrehber.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.project.burcrehber.R
import com.project.burcrehber.model.Horoscope

class HoroscopeBaseAdapter(var horoscopeList:ArrayList<Horoscope>,var context: Context):BaseAdapter() {


    override fun getCount(): Int {
        return horoscopeList.size
    }

    override fun getItem(position: Int): Any {
        return horoscopeList[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var view=convertView

        if (view == null){
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.single_row_horoscope, parent, false)
        }

        val horoscopeImgView = view?.findViewById<ImageView>(R.id.imgHoroscopeSymbol)
        val horoscopeNameTextView = view?.findViewById<TextView>(R.id.horoscopeNameText)
        val horoscopeDateTextView = view?.findViewById<TextView>(R.id.horoscopeDateText)

        horoscopeImgView?.setImageResource(horoscopeList[position].horoscopeSymbol)
        horoscopeNameTextView?.text=horoscopeList[position].horoscopeName
        horoscopeDateTextView?.text=horoscopeList[position].horoscopeDate

        return view
    }
}

