package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen2)
        btnlogin.setOnClickListener {
            val intent = Intent(this,Homescreen::class.java)
            startActivity(intent)
        }
    }
}