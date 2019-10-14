package com.example.fade_and_scale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var image=findViewById<ImageView>(R.id.image)
        var scale=findViewById<Button>(R.id.scale)
        var fade=findViewById<Button>(R.id.fade)

        scale.setOnClickListener()
        {
            val animation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.scale)
            image.startAnimation(animation)
        }

        fade.setOnClickListener()
        {
            val animation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.fade)
            image.startAnimation(animation)
        }

    }
}
