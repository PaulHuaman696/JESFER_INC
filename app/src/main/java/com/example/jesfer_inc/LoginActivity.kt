package com.example.jesfer_inc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextEmail = findViewById<EditText>(R.id.textEmail)
        val editTextPassword = findViewById<EditText>(R.id.textPassword)
        val entramenu = findViewById<Button>(R.id.btn_entrar) //Colocas el ID del boton
        entramenu.setOnClickListener (){
            val username = editTextEmail.getText().toString();
            val password = editTextPassword.getText().toString();

            if(isValidCredentials(username, password)){
                entrarMenu()
            } else {
                MsgBox("Claves son incorrectas, pruwbw con:admin,123")
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
    fun MsgBox(msg: String){
        android.widget.Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}