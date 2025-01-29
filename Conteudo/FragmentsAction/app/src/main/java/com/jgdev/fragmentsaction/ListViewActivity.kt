package com.jgdev.fragmentsaction

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private  lateinit var  listViewUSer: ListView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_view)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val users = listOf("Gonçlaves","Anny","Gui","Maria","Guilherme","Maykon")

        listViewUSer = findViewById(R.id.listview_user)

        listViewUSer.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_activated_2,
            android.R.id.text1,
            users
        )

    }
}