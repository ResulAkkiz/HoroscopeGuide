package com.project.burcrehber
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.burcrehber.adapter.HoroscopeBaseAdapter
import com.project.burcrehber.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter=HoroscopeBaseAdapter(this)
        binding.horoscopeListView.adapter=adapter
    }
}