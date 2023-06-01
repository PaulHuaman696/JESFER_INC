package com.example.jesfer_inc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val drawarLayout = findViewById<DrawerLayout>(R.id.drawarLayout)
        val imgMenu = findViewById<ImageView>(R.id.imgMenu)
        val navView = findViewById<NavigationView>(R.id.navDrawar)
        navView.itemIconTintList = null
        imgMenu.setOnClickListener{
            drawarLayout.openDrawer(GravityCompat.START)
        }
    }
}