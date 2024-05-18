package com.example.montenegro_parcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Stadiums : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stadiums)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

         fun listaEstadio(): List<Stadium_Model> {
            var lstEstadio: ArrayList<Stadium_Model> = ArrayList()

            lstEstadio.add(
                Stadium_Model(
                    R.drawable.estadio,
                    "Mercedes-Benz-Stadium",
                    "Atlanta, GA",
                    "71.000"
                )
            )
            return lstEstadio
        }


        val btnMenu: Button = findViewById(R.id.btnMenu)

        btnMenu.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }
}