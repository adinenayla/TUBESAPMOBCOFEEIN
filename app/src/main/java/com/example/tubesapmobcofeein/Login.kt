package com.example.tubesapmobcofeein

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Login:AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var btnregis : Button
    private lateinit var btnlg : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btnlg = findViewById(R.id.btnlogin)
        btnlg.setOnClickListener {
            startActivity(Intent(this,Homescreen::class.java))
        }
        btnregis = findViewById(R.id.register)
        btnregis.setOnClickListener {
            startActivity(Intent(this,Daftar::class.java))
        }

        // Initialize Firebase Auth
        auth = Firebase.auth
            // Check if user is signed in (non-null) and update UI accordingly.
            val currentUser = auth.currentUser
            if(currentUser != null){
            }
    }
}