package com.angeldev.cupcakeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var btnRecoverPassword: Button
    private lateinit var btnSignUp: Button
    private lateinit var btnGoogle: ImageView
    private lateinit var  btnFacebook: ImageView
    private lateinit var  btnTwitter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        btnSignUp = findViewById(R.id.btnSignUp)
        btnRecoverPassword = findViewById(R.id.btnRecoverPassword)
        btnGoogle = findViewById(R.id.btnGoogle)
        btnFacebook = findViewById(R.id.btnFacebook)
        btnTwitter = findViewById(R.id.btnTwitter)

        btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnSignUp.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        btnRecoverPassword.setOnClickListener{
            val intent = Intent(this, RecoverPasswordActivity::class.java)
            startActivity(intent)
        }
        btnGoogle.setOnClickListener{
            Toast.makeText(this, "Login Google", Toast.LENGTH_SHORT).show()
        }
        btnFacebook.setOnClickListener{
            Toast.makeText(this, "Login Facebook", Toast.LENGTH_SHORT).show()
        }
        btnTwitter.setOnClickListener{
            Toast.makeText(this, "Login Twitter", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onStart() {
        super.onStart()
        Log.e("activities","onStart Login")
    }

    override fun onResume() {
        super.onResume()
        Log.e("activities","onResume Login")
    }

    override fun onPause() {
        Log.e("activities","onPause Login")
        super.onPause()
    }

    override fun onStop() {
        Log.e("activities","onStop Login")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("activities","onRestart Login")
    }

    override fun onDestroy() {
        Log.e("activities","onDestroy Login")
        super.onDestroy()
    }


}