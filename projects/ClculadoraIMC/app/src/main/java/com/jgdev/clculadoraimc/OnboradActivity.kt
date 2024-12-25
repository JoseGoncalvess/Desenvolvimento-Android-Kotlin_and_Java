package com.jgdev.clculadoraimc

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jgdev.clculadoraimc.models.Imc

class OnboradActivity : AppCompatActivity() {

    lateinit var resultPeso : TextView
    lateinit var resultAltura : TextView
    lateinit var resultCalc : TextView
    lateinit var btnReflesh : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_onborad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    initVar()


        val buble = intent.extras

        if (buble != null) {
            println("NÂO TA NULO")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
               val imc : Imc? =   buble.getParcelable("dadosimc", Imc::class.java) // VERSÃO NOVO RECOMENDANDA
                resultPeso.text = "O peso Infomrado foi: ${imc!!.peso.toString()} Kg"
                resultAltura.text = "A Altura Infomrada foi: ${imc!!.altura.toString()} M"
                resultCalc.setText(imc.calcImc())
            } else {
                val imc : Imc? = buble.getParcelable("dadosimc")// VERSÃO NOVO RECOMENDANDA
                resultPeso.text = "O peso Infomrado foi: ${imc!!.peso.toString()} Kg"
                resultAltura.text = "A Altura Infomrada foi: ${imc!!.altura.toString()} M"
                resultCalc.text = imc.calcImc()

            }

        }
        btnReflesh.setOnClickListener {
            finish()
        }

    }

    fun initVar(){
        resultAltura = findViewById(R.id.DadosAltura)
        resultPeso = findViewById(R.id.DadosPeso)
        resultCalc = findViewById(R.id.Result)
        btnReflesh = findViewById(R.id.refleshbtn)
    }



}