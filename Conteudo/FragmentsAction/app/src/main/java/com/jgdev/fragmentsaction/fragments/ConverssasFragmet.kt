package com.jgdev.fragmentsaction.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jgdev.fragmentsaction.R

class ConverssasFragmet : Fragment(R.layout.fragment_converssas) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LIFE_CYCLE","INICIO DA  -> onAttach")
        // CHADO QUANDO O FRAGMENTO È ANEXADO A UMA TELA
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LIFE_CYCLE","INICIO DA  -> onCreate")
        // CARREGAR CONF QUE SERA USADAS, CRIANDO O FRAGMENTO

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LIFE_CYCLE","INICIO DA  -> onCreateView")
        // CRIA A VISUALIZAÇÃO D FRAGMENTO
        return inflater.inflate(R.layout.fragment_converssas, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LIFE_CYCLE","INICIO DA  -> onViewCreated")
        // AQUI POSSO EXECULYTAR COISAS APOIS A VISUALIZAÇÂO SER CIRADA

    }

    // CICLOS DE VIDA QUE COMPARTILHAD A ACTIVIT

    override fun onStart() {
        super.onStart()
        Log.i("LIFE_CYCLE","INICIO DA  -> onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFE_CYCLE","INICIO DA  -> onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFE_CYCLE","INICIO DA  -> onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFE_CYCLE","INICIO DA  -> onStop")
    }

    // APOS A TELA SER DESTRUIDA
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LIFE_CYCLE","INICIO DA  -> onDestroyView")
        // DETSROIA  VISUALIZAÇÂO CRIADA
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFE_CYCLE","INICIO DA  -> onDestroy")
        // DESTROI O FRAGMENT
    }

    override fun onDetach() {
        super.onDetach()
        // DESACOPLA O FRAGMENTE DA TELA


    }
}