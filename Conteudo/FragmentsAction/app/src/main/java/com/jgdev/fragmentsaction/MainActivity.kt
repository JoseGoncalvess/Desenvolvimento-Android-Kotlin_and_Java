package com.jgdev.fragmentsaction

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
        val converssasFragmet = ConverssasFragmet()
        val statusFragment =StatusFragment()
        btnConverssa.setOnClickListener {
       supportFragmentManager
           .beginTransaction()
           .replace(R.id.fragment_container,converssasFragmet)
           .commit()
        }

        btnStatus.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,statusFragment)
                .commit()
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



        }


        }


    fun init(){
        btnConverssa=findViewById(R.id.btn_converssas)
        btnStatus=findViewById(R.id.btn_status)
        btnHome=findViewById(R.id.btn_reset)
    }
    }
