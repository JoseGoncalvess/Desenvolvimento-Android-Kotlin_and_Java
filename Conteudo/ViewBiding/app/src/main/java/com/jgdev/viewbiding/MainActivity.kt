package com.jgdev.viewbiding

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jgdev.viewbiding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   // INSTANCIANDO UM BIDING
    // 1º FORMA
//    private lateinit var binding : ActivityMainBinding;


    private  val binding  by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    };


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
         // RIAÇÂO DE UM BIDING

//        1º FORMA
//        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnClick.setOnClickListener {
            Toast.makeText(this,"CLCICLOU",Toast.LENGTH_LONG)
        }

        binding.btnExecultar?.setOnClickListener {
            Toast.makeText(this,"EXECULTAR",Toast.LENGTH_LONG)
        }


        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}