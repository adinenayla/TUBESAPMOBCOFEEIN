package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Account : AppCompatActivity() {
    private lateinit var btnep : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frontsettings)
        btnep = findViewById(R.id.editprofile)
        btnep.setOnClickListener(
            startActivity(Intent(this,Editaccount::class.java))
        )
    }
}