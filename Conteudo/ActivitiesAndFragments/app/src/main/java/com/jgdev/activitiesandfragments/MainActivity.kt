package com.jgdev.activitiesandfragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jgdev.activitiesandfragments.models.Anime
import com.jgdev.activitiesandfragments.models.User


class MainActivity : AppCompatActivity() {
    lateinit var btnAbrir : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Life_Cicle","onCreate")

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initVar()
        btnAbrir.setOnClickListener {


            val intent = Intent(this, DetailsActivity::class.java)

            var userObject = User("Jackie Chan",70)
            var animeObject = Anime("Naruto",500)

            intent.putExtra("usuario",userObject)
            intent.putExtra("anime",animeObject)

            intent.putExtra("userName","Jackie Chan")
            intent.putExtra("userIdade",70)


            startActivity(intent)
        }


    }

    fun initVar(){
        btnAbrir = findViewById(R.id.btn_abrir)
    }




    override fun onStart() {
        super.onStart()
        Log.i("Life_Cicle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Life_Cicle","OnResum")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Life_Cicle","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Life_Cicle","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("Life_Cicle","onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Life_Cicle","onDestroy")

    }


}