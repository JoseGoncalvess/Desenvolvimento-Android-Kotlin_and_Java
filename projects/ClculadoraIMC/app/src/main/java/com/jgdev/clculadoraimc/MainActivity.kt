package com.jgdev.clculadoraimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.jgdev.clculadoraimc.models.Imc

class MainActivity : AppCompatActivity() {
    lateinit var  btnCalcular:Button;
    lateinit var  inputPesoText:TextInputEditText;
    lateinit var  inputAlturaText:TextInputEditText;
    lateinit var  inputAlturaLayout:TextInputLayout;
    lateinit var  inputPesoLayout:TextInputLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initVAr()

        btnCalcular.setOnClickListener {
            val intent = Intent(this, OnboradActivity::class.java).apply {
                val imc = getImc(inputAlturaText.text.toString(), inputPesoText.text.toString())
                if(imc!= null){
                    putExtra("dadosimc",imc)

                }
            }
            startActivity(intent)


        }


    }

    private fun getImc( altura : String, peso : String  ): Imc? {

        if (altura.isEmpty()){
            inputAlturaLayout.error = "A Altura Precisa ser Infomada"
            return  null;
        } else if (peso.isEmpty()){
            inputPesoLayout.error = "O Peso Precisa ser Infomado"
            return  null;
        }
            return Imc(peso.toDouble(), altura.toDouble())

    }

    fun initVAr(){
        btnCalcular = findViewById(R.id.btnCalc)
        inputPesoText = findViewById(R.id.inputTextPeso)
        inputAlturaText = findViewById(R.id.inputTextAltura)

        inputAlturaLayout = findViewById(R.id.InputLayoutAltura)
        inputPesoLayout = findViewById(R.id.InputLayoutPeso)
    }


}