package com.example.tubesapmobcofeein

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.auth.User
import kotlinx.android.synthetic.main.login.*

class Login:AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var btnregis : Button
    private lateinit var btnlg : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        auth = FirebaseAuth.getInstance()
        btnlg = findViewById(R.id.btnlogin)
        btnlg.setOnClickListener {
            val email = edUsername.text.toString()
            val password = edPassword.text.toString()
            auth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("Login", "login Success")
                        val User = auth.currentUser
                        startActivity(Intent(this,Homescreen::class.java))
                    }
                }
                        .addOnFailureListener {
                            Log.w("Login","Login Gagal",it)
                        }

        }
        btnregis = findViewById(R.id.register)
        btnregis.setOnClickListener {
            startActivity(Intent(this,Daftar::class.java))
        }
    }
}