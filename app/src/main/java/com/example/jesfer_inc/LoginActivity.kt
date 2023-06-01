package com.example.jesfer_inc

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        checkOrientation(resources.configuration.orientation)
        val entramenu = findViewById<Button>(R.id.btn_entrar) //Colocas el ID del boton
        entramenu.setOnClickListener {
            entrarMenu()
        }
    }
    private fun entrarMenu(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun checkOrientation(orientation: Int) {
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Establecer el modo de pantalla completa cuando está en posición horizontal
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    )
        } else {
            // Restaurar el modo de pantalla normal en otras orientaciones
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        }
    }
}