package com.example.tubesapmobcofeein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.firestore.FirebaseFirestore

class Editaccount : AppCompatActivity() {
    private lateinit var btnsilang : Button
    private lateinit var btnsp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editaccount)
        btnsilang = findViewById(R.id.silang)
        btnsilang.setOnClickListener {
            startActivity(Intent(this,Account::class.java))
        }
        btnsp = findViewById(R.id.saveprofile)
        btnsp.setOnClickListener {
            startActivity(Intent(this,Account::class.java))
        }
    }
}