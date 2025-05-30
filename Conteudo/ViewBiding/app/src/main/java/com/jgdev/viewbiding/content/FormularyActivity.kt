package com.jgdev.viewbiding.content

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
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
            btnEnviar.setOnClickListener {
//                atualizar()
//                awitchToggle()
                showSnackBar(it)
            }

        }
    }

    private fun showSnackBar(view: View) {
        val snakBar = Snackbar.make(
            view,"Rustinn!!!",Snackbar.LENGTH_LONG
        )
        snakBar.setAction("OPA",{
            Toast.makeText(this,"Feito",Toast.LENGTH_LONG).show()
        })
        snakBar.setBackgroundTint(ContextCompat.getColor(this, R.color.black),)
        snakBar.setActionTextColor(ContextCompat.getColor(this,android.R.color.holo_purple))

    }

    private fun awitchToggle() {
        val switchMarcado = biding.switchNotification.isChecked
        val toggleMarcado = biding.toggleCont.isChecked

        val text = "Switch: $switchMarcado | Tooggle: $toggleMarcado"

        biding.textResult.text = text
    }

    private fun atualizar() {
      val chek =   biding.chekedTerm.isChecked
        val resultado = if (chek) "SIm" else "Não"
        biding.textResult.text = "O CHEKEDE ESTÀ $resultado"
    }
    private fun cheked(){

        biding.chekedTerm.setOnCheckedChangeListener { compoundButton, isCheked ->
            val resultado = if (isCheked) "SIm" else "Não"
            biding.textResult.text = "O CHEKEDE ESTÀ $resultado"
        }
    }
}