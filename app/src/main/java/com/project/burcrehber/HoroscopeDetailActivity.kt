package com.project.burcrehber

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.palette.graphics.Palette
import com.project.burcrehber.databinding.ActivityHoroscopeDetailBinding
import com.project.burcrehber.model.Horoscope


class HoroscopeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHoroscopeDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val horoscope = intent.extras?.get("horoscope") as Horoscope
        binding.horoscopeDetailText.text = horoscope.horoscopeDetailText
        binding.header.setImageResource(horoscope.horoscopeBigSymbol)
        setSupportActionBar(binding.animToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.collapsingToolbar.title = horoscope.horoscopeName

        val bitmap = BitmapFactory.decodeResource(resources, horoscope.horoscopeBigSymbol)
        Palette.from(bitmap)
            .generate { palette -> val mutedColor = palette?.getVibrantColor(androidx.appcompat.R.attr.colorAccent)
                binding.collapsingToolbar.setContentScrimColor(mutedColor ?: androidx.appcompat.R.attr.colorAccent)
                window.statusBarColor=mutedColor ?: androidx.appcompat.R.attr.colorAccent
            }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }




}