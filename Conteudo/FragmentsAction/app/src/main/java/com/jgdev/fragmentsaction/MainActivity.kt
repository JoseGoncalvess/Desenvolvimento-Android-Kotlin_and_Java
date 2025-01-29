package com.jgdev.fragmentsaction

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.*
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jgdev.fragmentsaction.fragments.ConverssasFragmet
import com.jgdev.fragmentsaction.fragments.StatusFragment

class MainActivity : AppCompatActivity() {
    lateinit var btnConverssa: Button;
    lateinit var btnStatus: Button;
    lateinit var btnHome: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_view)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()

        val converssasFragmet = ConverssasFragmet()
        val statusFragment = StatusFragment()


// METODO ANTIGO
        btnConverssa.setOnClickListener {
       supportFragmentManager
           .beginTransaction()
           .replace(R.id.fragment_container,converssasFragmet)
           .commit()
        }


        // METODO COM O KOTLIN KTX EXTENSION
        btnStatus.setOnClickListener {
            val bundle = bundleOf(
                "categoria" to "Fragment Ativo"
            )


//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragment_container,statusFragment)
//                .commit()


            // FORMA COM ANDROID KTX
            supportFragmentManager.commit{
                replace<StatusFragment>(R.id.fragment_container, args = bundle)

            }
        }

        btnHome.setOnClickListener {
            val fragmentManeger = supportFragmentManager
            if (fragmentManeger.fragments.contains(converssasFragmet)){
                fragmentManeger
                    .beginTransaction()
                    .remove(converssasFragmet)
                    .commit()
            }else if (fragmentManeger.fragments.contains(statusFragment)){
                fragmentManeger
                    .beginTransaction()
                    .remove(statusFragment)
                    .commit()
            } else {
                fragmentManeger
                    .beginTransaction()
                    .commit()
            }

            Toast.makeText(this, "CLiocu no BTN HOME", Toast.LENGTH_SHORT).show()


        }


        }


    fun init(){
        btnConverssa=findViewById(R.id.btn_converssas)
        btnStatus=findViewById(R.id.btn_status)
        btnHome=findViewById(R.id.btn_reset)
    }
    }
