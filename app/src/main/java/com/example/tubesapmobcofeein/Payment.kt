package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payment : AppCompatActivity() {
    private lateinit var btnpayment : Button
    private lateinit var btnkmp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)
        btnpayment = findViewById(R.id.makeorder)
        btnpayment.setOnClickListener {
            startActivity(Intent(this,Received::class.java))
        }
        btnkmp = findViewById(R.id.kembalipayment)
        btnkmp.setOnClickListener {
            startActivity(Intent(this,Cart::class.java))
        }
    }
}