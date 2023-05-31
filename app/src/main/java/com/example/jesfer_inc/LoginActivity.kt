package com.example.jesfer_inc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val entramenu = findViewById<Button>(R.id.btn_entrar) //Colocas el ID del boton
        entramenu.setOnClickListener {
            entrarMenu()
        }
    }
    private fun entrarMenu(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}