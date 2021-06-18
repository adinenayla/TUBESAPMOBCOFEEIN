package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Received : AppCompatActivity() {
    private lateinit var btnkmr : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.received)
        btnkmr = findViewById(R.id.kembaliorder)
        btnkmr.setOnClickListener {
            startActivity(Intent(this,Homescreen::class.java))
        }
    }
}