package com.project.burcrehber.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.project.burcrehber.R

class HoroscopeArrayAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    private var horoscopeNameList: Array<String>,
    private var horoscopeDateList: Array<String>,
    private var horoscopeImgList: Array<Int>,
) : ArrayAdapter<String>(context, resource, textViewResourceId, horoscopeNameList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view=convertView

        if (view ==null){
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.single_row_horoscope, parent, false)

        }
        val horoscopeImgView = view?.findViewById<ImageView>(R.id.imgHoroscopeSymbol)
        val horoscopeNameTextView = view?.findViewById<TextView>(R.id.horoscopeNameText)
        val horoscopeDateTextView = view?.findViewById<TextView>(R.id.horoscopeDateText)

        horoscopeImgView?.setImageResource(horoscopeImgList[position])
        horoscopeNameTextView?.text=horoscopeNameList[position]
        horoscopeDateTextView?.text=horoscopeDateList[position]

        return view ?:TextView(context)
    }
}