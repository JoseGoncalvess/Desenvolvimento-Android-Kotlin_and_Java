package com.jgdev.activitiesandfragments.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// TODO VERSSÃO MAIS NOVA
// RECOMENDADA PELA DOCUMENTAÇÂO
// <https://developer.android.com/kotlin/parcelize?hl=pt-br#kts>
@Parcelize
data class Anime(
    val nome : String,
    val qtdEp : Int
) : Parcelable
