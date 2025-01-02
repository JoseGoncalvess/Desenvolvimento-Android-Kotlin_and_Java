package com.jgdev.fragmentsaction.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.jgdev.fragmentsaction.R

class StatusFragment : Fragment(R.layout.fragment_status) {
   lateinit var btnArg : Button;
   lateinit var textCategori : TextView;
    var  categoriText : String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
        categoriText = arguments?.getString("categoria")

}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_status, container,false)
        btnArg = view.findViewById(R.id.btn_exibi_arg)
        textCategori = view.findViewById(R.id.text_categoria)

        btnArg.setOnClickListener {
            textCategori.setText(categoriText);
        }

        return view
    }



}