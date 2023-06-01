package com.example.jesfer_inc

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        checkOrientation(resources.configuration.orientation)


        val editTextEmail = findViewById<EditText>(R.id.textEmail)
        val editTextPassword = findViewById<EditText>(R.id.textPassword)

        val entramenu = findViewById<Button>(R.id.btn_entrar) //Colocas el ID del boton
        entramenu.setOnClickListener (){
            val username = editTextEmail.getText().toString();
            val password = editTextPassword.getText().toString();

            if(isValidCredentials(username, password)){
                entrarMenu()
            } else {
                MsgBox("Claves son incorrectas, prueba con:admin,123")
            }

        }
    }
    private fun entrarMenu(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun isValidCredentials(username: String, password: String): Boolean {
        return username.equals("admin") && password.equals("123");
    }
    private fun MsgBox(msg: String) {
        android.widget.Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
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