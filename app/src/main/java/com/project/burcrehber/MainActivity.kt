package com.project.burcrehber


import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.project.burcrehber.adapter.HoroscopeBaseAdapter
import com.project.burcrehber.databinding.ActivityMainBinding
import com.project.burcrehber.model.Horoscope


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val horoscopeList: ArrayList<Horoscope> = ArrayList(12)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        getResource()
        val adapter = HoroscopeBaseAdapter(horoscopeList, this)
        binding.horoscopeListView.adapter = adapter

        binding.horoscopeListView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val intent = Intent(this, HoroscopeDetailActivity::class.java)
                intent.putExtra("horoscope",horoscopeList[position])
                startActivity(intent)
            }




    }

    private fun getResource() {

        val horoscopeNames = resources.getStringArray(R.array.burclar)
        val horoscopeDates = resources.getStringArray(R.array.burcTarih)
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
        val horoscopeBigImages = arrayOf(
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
        val horoscopeDetailText = resources.getStringArray(R.array.burcGenelOzellikler)

        for (i in 0..11) {
            horoscopeList.add(
                Horoscope(
                    horoscopeNames[i],
                    horoscopeDates[i],
                    horoscopeImages[i],
                    horoscopeBigImages[i],
                    horoscopeDetailText[i]
                )
            )
        }

    }
}