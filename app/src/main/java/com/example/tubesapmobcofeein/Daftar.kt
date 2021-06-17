package com.example.tubesapmobcofeein

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.create_account.*
import kotlinx.android.synthetic.main.create_account.edPassword

class Daftar:AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var db:FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_account)
        // Initialize Firebase Auth
        auth = Firebase.auth
        db = Firebase.firestore
        val btn = findViewById<Button>(R.id.btnca)
        btn.setOnClickListener {
            val email = edEmail.text.toString()
            val password = edPassword.text.toString()
            val nama = ednamalengkap.text.toString()
            val tanggallahir = edTanggal.text.toString()
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("daftar", "createUserWithEmail:success")
                        val user = auth.currentUser
                        val datauser = hashMapOf(
                            "nama" to nama,
                            "Tanggallahir" to tanggallahir
                        )
                        db.collection("Users").document(user!!.uid).set(datauser).addOnCompleteListener {
                            Log.d("daftar","Membuat Profil User Success")
                        }
                            .addOnFailureListener {
                                Log.w("daftar","Membuat Profil User Gagal",it)
                            }
                        val intent = Intent(this,Login::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("daftar", "createUserWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}