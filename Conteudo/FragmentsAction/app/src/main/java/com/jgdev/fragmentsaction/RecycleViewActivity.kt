package com.jgdev.fragmentsaction

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.jgdev.fragmentsaction.R.*
import com.jgdev.fragmentsaction.adapter.Mensagem
import com.jgdev.fragmentsaction.adapter.MensagemAdapter

class RecycleViewActivity : AppCompatActivity() {
    lateinit var  rv_list : RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_recycle_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val persons = listOf<Mensagem>(

            Mensagem("Gonçlaves","Bora lozin?",true),
            Mensagem("Anny","Ja ta vindo amor?",false),
            Mensagem("Gui","Iae, Irmão!",false),
            Mensagem("Maria","Bora Volei hoje?",true),
            Mensagem("Yanne","Saudades, amigo...",false),
        )
        rv_list = findViewById(id.rv_view)

        rv_list.adapter = MensagemAdapter(persons)
//        rv_list.layoutManager = LinearLayoutManager(this)

//        Linear Layout
//        rv_list.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        // GRID LAYOUT 
//        rv_list.layoutManager = GridLayoutManager(this, 3, RecyclerView.HORIZONTAL, false)

        // Starategy
        rv_list.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.HORIZONTAL
        )


    }
}