package com.example.mylibrary

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

const val FILMS: String = "FILMS"

const val TITLE: String = "title"
const val DESCR: String = "descr"
const val YEAR: String = "year"

@Parcelize
data class Payload(
    val title: String,
    val year: String,
    val description: String
) : Parcelable