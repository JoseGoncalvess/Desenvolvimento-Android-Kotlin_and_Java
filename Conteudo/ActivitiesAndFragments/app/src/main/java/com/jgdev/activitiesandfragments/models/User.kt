package com.jgdev.activitiesandfragments.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable


// VERSSÂO ANTIGA
@Parcelize
data class User(
    val nome: String,
    val age : Int
) : Parcelable
