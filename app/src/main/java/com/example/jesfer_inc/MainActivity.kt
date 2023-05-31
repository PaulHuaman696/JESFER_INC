package com.example.jesfer_inc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entramenu = findViewById<Button>(R.id.btn_entra) //Colocas el ID del boton
        entramenu.setOnClickListener{
            entrarMenu()
        }
    }

    private fun entrarMenu(){
        val i = Intent(this, MainActivity2::class.java)
        startActivity(i)
    }
}