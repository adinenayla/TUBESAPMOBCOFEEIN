package com.example.tubesapmobcofeein

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuLengkap : AppCompatActivity() {
    private lateinit var btnic : ImageView
    private lateinit var btnim : ImageView
    private lateinit var btnir : ImageView
    private lateinit var btnimatcha :ImageView
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
    }
}