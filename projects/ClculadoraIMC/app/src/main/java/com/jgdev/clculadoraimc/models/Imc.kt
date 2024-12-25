package com.jgdev.clculadoraimc.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class Imc(
    val peso : Double,
    val altura: Double
): Parcelable {
    fun calcImc() : String{
        val result :Double = peso / ( altura * altura )
        var resultState = ""
         when (result) {
            in 1.0..18.5 -> resultState =  "Abaixo"
            in 18.6.. 24.9 -> resultState =  "Normal"
            in 25.0..29.9 -> resultState =  "Sobrepeso"
            in 30.0..39.9 -> resultState =  "Obesidade"
        }
        return resultState ;
    }
}
