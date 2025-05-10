package com.jgdev.viewbiding.content

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.transition.Visibility
import com.jgdev.viewbiding.R
import com.jgdev.viewbiding.databinding.ActivityFloatingActionButtonBinding
import com.jgdev.viewbiding.databinding.ActivityMainBinding

class FloatingActionButtonActivity : AppCompatActivity() {
    private  val binding  by lazy {
        ActivityFloatingActionButtonBinding.inflate(layoutInflater)
    };

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        with(binding){
                FabButton.setOnClickListener{
                   if(groupMenu.isVisible){
                       groupMenu.visibility = View.INVISIBLE
                   }
                    groupMenu.visibility = View.VISIBLE
                }
        }
    }
}