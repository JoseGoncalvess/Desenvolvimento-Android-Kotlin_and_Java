package com.jgdev.viewbiding.content

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jgdev.viewbiding.R
import com.jgdev.viewbiding.databinding.ActivityFormularyBinding

class FormularyActivity : AppCompatActivity() {
    private  val   biding by lazy {
ActivityFormularyBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(biding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(biding){
//            btnEnviar.setOnClickListener {
//                atualizar()
//            }

            chekedTerm.setOnCheckedChangeListener { compoundButton, isCheked ->
                val resultado = if (isCheked) "SIm" else "Não"
                biding.textResult.text = "O CHEKEDE ESTÀ $resultado"
            }
        }
    }

    private fun atualizar() {
      val chek =   biding.chekedTerm.isChecked
        val resultado = if (chek) "SIm" else "Não"
        biding.textResult.text = "O CHEKEDE ESTÀ $resultado"
    }
}