package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Icecoffee : AppCompatActivity() {
    private lateinit var btncart : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order)
        btncart = findViewById(R.id.addicecoffee)
        btncart.setOnClickListener {
            startActivity(Intent(this,Cart::class.java))
        }
    }
}