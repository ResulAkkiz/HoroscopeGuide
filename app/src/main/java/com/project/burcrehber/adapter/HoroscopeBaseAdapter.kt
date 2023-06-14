package com.project.burcrehber.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.project.burcrehber.R

class HoroscopeBaseAdapter(private val context: Context):BaseAdapter() {

    private var horoscopeList:ArrayList<Horoscope> = ArrayList()

    init {
        val horoscopeNames=context.resources.getStringArray(R.array.burclar)
        val horoscopeDates=context.resources.getStringArray(R.array.burc_tarihleri)
        val horoscopeImages = arrayOf(
            R.drawable.koc1,
            R.drawable.boga2,
            R.drawable.ikizler3,
            R.drawable.yengec4,
            R.drawable.aslan5,
            R.drawable.basak6,
            R.drawable.terazi7,
            R.drawable.akrep8,
            R.drawable.yay9,
            R.drawable.oglak10,
            R.drawable.kova11,
            R.drawable.balik12
        )

        for(i in 0..11){
            horoscopeList.add(Horoscope(horoscopeNames[i],horoscopeDates[i],horoscopeImages[i]))
        }
    }

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

data class Horoscope(var horoscopeName:String,var horoscopeDate:String,var horoscopeSymbol:Int)