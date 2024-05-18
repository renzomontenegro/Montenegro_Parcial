package com.example.montenegro_parcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnPrizes: Button = findViewById(R.id.btnPrizes)
        val btnTeams: Button = findViewById(R.id.btnTeams)
        val btnStadiums: Button = findViewById(R.id.btnStadiums)


        btnPrizes.setOnClickListener{
            val intent = Intent(this, Prizes::class.java)
            startActivity(intent)
        }
        btnTeams.setOnClickListener{
            val intent = Intent(this, Teams::class.java)
            startActivity(intent)
        }
        btnStadiums.setOnClickListener{
            val intent = Intent(this, Stadiums::class.java)
            startActivity(intent)
        }


    }
}