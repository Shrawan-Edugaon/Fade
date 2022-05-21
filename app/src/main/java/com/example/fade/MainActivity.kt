package com.example.fade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFadeIn = findViewById<Button>(R.id.fadeIn)
        val btnFadeOut = findViewById<Button>(R.id.fadeOut)

        btnFadeIn.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.fade_in)
            image.startAnimation(animation)
        }
        btnFadeOut.setOnClickListener {
            val image  = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.fade_out)
            image.startAnimation(animation)
        }
    }
}