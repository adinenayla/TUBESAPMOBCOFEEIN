package com.example.tubesapmobcofeein

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuLengkap : AppCompatActivity() {
    private lateinit var btnic : ImageView
    private lateinit var btnim : ImageView
    private lateinit var btnir : ImageView
    private lateinit var btnimatcha :ImageView
    private lateinit var btnback : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menulengkap)
        btnic = findViewById(R.id.menuicecoffee)
        btnim = findViewById(R.id.menuicemocca)
        btnir = findViewById(R.id.menuiceregal)
        btnimatcha = findViewById(R.id.menuicematcha)
        btnic.setOnClickListener {
            startActivity(Intent(this,Icecoffee::class.java))
        }
        btnim.setOnClickListener {
            startActivity(Intent(this,Icemocca::class.java))
        }
        btnir.setOnClickListener {
            startActivity(Intent(this,Iceregal::class.java))
        }
        btnimatcha.setOnClickListener {
            startActivity(Intent(this,Icematcha::class.java))
        }
        btnback = findViewById(R.id.kembalimenu)
        btnback.setOnClickListener {
            startActivity(Intent(this,Homescreen::class.java))
        }
    }
}