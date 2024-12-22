package com.jgdev.alcooougasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var inputTextAlcoo : TextInputEditText;
    private lateinit var inputTextGasolina : TextInputEditText;

    private lateinit var inputLayoutAlcoo : TextInputLayout;
    private lateinit var inputLayoutGasolina : TextInputLayout;


    private lateinit var btnCalc : Button;
    private lateinit var resultText : TextView;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initVars()
        btnCalc.setOnClickListener {
            calcEconomi(inputTextGasolina.text.toString(), inputTextAlcoo.text.toString())
        }

    }




    protected  fun initVars(){
        inputTextGasolina  = findViewById(R.id.texteditgasolina)
        inputTextAlcoo = findViewById(R.id.texteditalcoo)

        inputLayoutAlcoo = findViewById(R.id.textinputalcoo)
        inputLayoutGasolina = findViewById(R.id.textinputgasolina)

        btnCalc = findViewById(R.id.btn_calc)
        resultText = findViewById(R.id.RresultText)

    }

    private fun calcEconomi( precoGasolina : String ,  precoAlcoo : String) {
    var validate = validateValue(precoGasolina, precoAlcoo)
        if (validate){
            val resultCalc = (precoAlcoo.toDouble() / precoGasolina.toDouble())
            if (resultCalc.toDouble() <= 0.7){
                resultText.setText("Álcool é a melhor opção !")
            }else{
                resultText.setText("Gasolina  é a melhor opção !")
            }
        }

    }

    protected  fun validateValue(pGasolina : String ,  pAlcoo : String) : Boolean {

        inputLayoutGasolina.error = null
        inputLayoutAlcoo.error = null
        if (pGasolina.isEmpty()){
            inputLayoutGasolina.error = "O Valor da Gasolina deve ser Informado"
            return false
        }else if (pAlcoo.isEmpty()){
            inputLayoutAlcoo.error = "O Valor da Álcoo deve ser Informado"
            return false
        }
        return  true
    }
}