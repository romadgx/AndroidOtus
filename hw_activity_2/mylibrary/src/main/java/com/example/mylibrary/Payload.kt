package com.example.mylibrary

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

const val FILMS: String = "FILMS"

@Parcelize
data class Payload(
    val title: String,
    val year: String,
    val description: String
) : Parcelable