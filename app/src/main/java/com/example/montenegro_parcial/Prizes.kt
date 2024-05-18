package com.example.montenegro_parcial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Prizes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        val etPeso: EditText = findViewById(R.id.etPeso)
        val etAltura: EditText = findViewById(R.id.etAltura)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            val peso = etPeso.text.toString().toDouble()
            val altura = etAltura.text.toString().toDouble()

            // Calcular el IMC
            val imc = peso / ((altura / 100) * (altura / 100))

            // Redondear el resultado a un decimal
            val imcRedondeado = String.format("%.1f", imc)

            // Mostrar el resultado en el TextView
            tvResultado.text = "IMC: $imcRedondeado"

            // Determinar el nivel de peso según el IMC
            val nivelPeso = if (imc < 18.5) {
                "Bajo peso"
            } else if (imc < 25.0) {
                "Peso saludable"
            } else if (imc < 30.0) {
                "Sobrepeso"
            } else {
                "Obesidad"
            }

            // Mostrar el nivel de peso en el TextView
            tvResultado.append("\nNivel de peso: $nivelPeso")

         */

        val tvFirst: TextView = findViewById(R.id.tvFirst)
        val tvSecond: TextView = findViewById(R.id.tvSecond)
        val tvThird: TextView = findViewById(R.id.tvThird)
        val tvFour: TextView = findViewById(R.id.tvFour)
        val etAmount: EditText = findViewById(R.id.etAmount)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val btnMenu: Button = findViewById(R.id.btnMenu)

        btnMenu.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        btnCalculate.setOnClickListener{
            val etAmount = etAmount.text.toString().toDouble()
            val prim = 0.25 * etAmount
            val seg = 0.15 * etAmount
            val ter = 0.1 * etAmount
            val cuar = etAmount - (prim+seg+ter)/13

            tvFirst.append("$prim")
            tvSecond.append("$seg")
            tvThird.append("$ter")
            tvFour.append("$cuar")
        }


    }
}