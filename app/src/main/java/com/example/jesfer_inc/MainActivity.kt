package com.example.jesfer_inc

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.Surface
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkOrientation(resources.configuration.orientation)
        val drawarLayout = findViewById<DrawerLayout>(R.id.drawarLayout)
        val imgMenu = findViewById<ImageView>(R.id.imgMenu)
        val navView = findViewById<NavigationView>(R.id.navDrawar)
        navView.itemIconTintList = null
        imgMenu.setOnClickListener{
            drawarLayout.openDrawer(GravityCompat.START)
        }
        val SeccionSystem = findViewById<ImageButton>(R.id.btn_system) //Se le asigna el id del boton sistema
        val SeccionDatos = findViewById<ImageButton>(R.id.btn_datos) //Se le asigna el id del boton datos
        val SeccionComunicacion = findViewById<ImageButton>(R.id.btn_comunicacion) //Se le asigna el id del boton comunicacion
        val SeccionMarketing = findViewById<ImageButton>(R.id.btn_marketing) //Se le asigna el id del boton marketing
        val SeccionCursos = findViewById<ImageButton>(R.id.btn_course) //Se le asigna el id del boton cursos
        val SeccionNotice = findViewById<ImageButton>(R.id.btn_notice) //Se le asigna el id del boton noticias
        SeccionSystem.setOnClickListener (){
                entrar("System")
        }
        SeccionDatos.setOnClickListener (){
            entrar("Datos")
        }
        SeccionMarketing.setOnClickListener (){
            entrar("Marketing")
        }
        SeccionComunicacion.setOnClickListener (){
            entrar("Comunicacion")
        }
        SeccionCursos.setOnClickListener (){
            entrar("Cursos")
        }
        SeccionNotice.setOnClickListener (){
            entrar("Noticias")
        }
    }
    private fun checkOrientation(orientation: Int) {
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Establece el modo de pantalla completa cuando está en posición horizontal
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    )
        } else {
            // Restaura el modo de pantalla normal en otras orientaciones
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        }
    }
    private fun entrar(seccion: String){
        when (seccion) {
            "System" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
            "Datos" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
            "Marketing" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
            "Comunicacion" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
            "Cursos" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
            "Noticias" -> {
                val i = Intent(this, SistemaActivity::class.java)
                startActivity(i)
            }
        }
    }
}