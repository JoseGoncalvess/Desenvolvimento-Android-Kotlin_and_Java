package com.jgdev.activitiesandfragments

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jgdev.activitiesandfragments.models.User

class DetailsActivity : AppCompatActivity() {
    lateinit var btnfechar: Button;
    lateinit var textResult: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()

        val buble: Bundle? = intent.extras

        if (buble != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                val user = buble.getParcelable("usuario", User::class.java)
                textResult.text = "Usuario: " + user!!.nome + " Idade: " + user!!.age

            } else {

                val user: User? = buble.getParcelable<User>("usuario") // VERSÃO NOVO RECOMENDANDA
                textResult.text = "O lutador :  ${user!!.nome}  está com ${user!!.age} Anos."

            }


        }
    btnfechar.setOnClickListener { finish() }

    }
    private fun init() {
        btnfechar = findViewById(R.id.btn_voltar)
        textResult = findViewById(R.id.textView3)

    }
}