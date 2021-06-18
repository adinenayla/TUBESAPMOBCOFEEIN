package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Account : AppCompatActivity() {
    private lateinit var btnedit : Button
    private lateinit var btnkembaliacc : Button
    private lateinit var btnlogout : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)
        btnedit = findViewById(R.id.editprofile)
        btnedit.setOnClickListener {
            startActivity(Intent(this,Editaccount::class.java))
        }
        btnkembaliacc = findViewById(R.id.kembaliacc)
        btnkembaliacc.setOnClickListener {
            startActivity(Intent(this,Homescreen::class.java))
        }
        btnlogout = findViewById(R.id.logout)
        btnlogout.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
    }
}