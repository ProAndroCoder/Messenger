package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_register.setOnClickListener {
            val username = et_Username.text.toString()
            val email = et_Email.text.toString()
            val password = et_Password.text.toString()

            Log.d("MainActivity", "Username : $username")
            Log.d("MainActivity", "Email : $email")
            Log.d("MainActivity", "Password : $password")

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    if (!it.isSuccessful) return@addOnCompleteListener

                    Log.d("MainActivity", "User is Created UID : ${it.result?.user?.uid}")
                }

        }

        txt_signin.setOnClickListener {
            Log.d("MainActivity", "Go to Login Activity")
            startActivity(Intent(this, Login::class.java))

        }


    }
}
