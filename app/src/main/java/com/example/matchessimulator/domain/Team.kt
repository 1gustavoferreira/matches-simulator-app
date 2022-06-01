package com.example.matchessimulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    @SerializedName("name")
    val name: String,
    @SerializedName("force")
    val stars: Int ,
    @SerializedName("image")
    val image: String,
    var score: Int?
): Parcelable
