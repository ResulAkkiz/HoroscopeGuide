package com.project.burcrehber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.project.burcrehber.adapter.HoroscopeArrayAdapter
import com.project.burcrehber.adapter.HoroscopeBaseAdapter
import com.project.burcrehber.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val burclar = resources.getStringArray(R.array.burclar)
        val burcTarihleri = resources.getStringArray(R.array.burc_tarihleri)
        val burcResimleri = arrayOf(
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
        val burcBuyukResimleri = arrayOf(
            R.drawable.koc_buyuk1,
            R.drawable.boga_buyuk2,
            R.drawable.ikizler_buyuk3,
            R.drawable.yengec_buyuk4,
            R.drawable.aslan_buyuk5,
            R.drawable.basak_buyuk6,
            R.drawable.terazi_buyuk7,
            R.drawable.akrep_buyuk8,
            R.drawable.yay_buyuk9,
            R.drawable.oglak_buyuk10,
            R.drawable.kova_buyuk11,
            R.drawable.balik_buyuk12
        )

     /*   val adapter = ArrayAdapter<String>(
            this,
            R.layout.single_row_horoscope,
            R.id.horoscopeNameText,
            burclar
        )*/
        val adapter=HoroscopeBaseAdapter(this)
        binding.horoscopeListView.adapter=adapter
    }
}