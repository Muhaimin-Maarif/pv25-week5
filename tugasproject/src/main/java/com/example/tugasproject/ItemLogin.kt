package com.example.tugasproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemLogin(
    val nama : String,
    val email : String,
    val password : String
):Parcelable