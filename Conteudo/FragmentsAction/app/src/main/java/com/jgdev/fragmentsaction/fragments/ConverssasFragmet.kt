package com.jgdev.fragmentsaction.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jgdev.fragmentsaction.R

class ConverssasFragmet : Fragment(R.layout.fragment_converssas) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_converssas, container, false)

    }
}