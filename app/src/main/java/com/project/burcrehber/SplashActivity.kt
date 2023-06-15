package com.project.burcrehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import com.project.burcrehber.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val logoAnim = AnimationUtils.loadAnimation(this, R.anim.rotatelogo)
        binding.logoImageView.animation=logoAnim

        object:CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent= Intent(this@SplashActivity,MainActivity::class.java)
                finish()
                startActivity(intent)

            }
        }.start()

    }
}