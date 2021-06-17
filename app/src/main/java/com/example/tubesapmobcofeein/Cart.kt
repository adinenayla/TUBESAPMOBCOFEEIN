package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cart : AppCompatActivity() {
    private lateinit var btnorder : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart)
        btnorder = findViewById(R.id.orderfx)
        btnorder.setOnClickListener {
            startActivity(Intent(this,Payment::class.java))
        }
    }
}