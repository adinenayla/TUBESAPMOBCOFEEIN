package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class Homescreen : AppCompatActivity() {
    private lateinit var btnichs : ImageView
    private lateinit var btnimhs : ImageView
    private lateinit var btnmenuhs : ImageView
    private lateinit var btnacchs : ImageView
    private lateinit var btnhomehs : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen2)
        btnichs = findViewById(R.id.imageicecoffee)
        btnichs.setOnClickListener {
            val intent = Intent(this,Icecoffee::class.java)
            startActivity(intent)
        }
        btnimhs = findViewById(R.id.imhomescreen)
        btnimhs.setOnClickListener {
            val intent = Intent(this,Icematcha::class.java)
            startActivity(intent)
        }
        btnmenuhs = findViewById(R.id.menuhs)
        btnmenuhs.setOnClickListener {
            val intent = Intent(this,MenuLengkap::class.java)
            startActivity(intent)
        }
        btnacchs = findViewById(R.id.accounths)
        btnacchs.setOnClickListener {
            val intent = Intent(this,Account::class.java)
            startActivity(intent)
        }
        btnhomehs = findViewById(R.id.homehs)
        btnhomehs.setOnClickListener {
            val intent = Intent(this,Homescreen::class.java)
            startActivity(intent)
        }
    }
}