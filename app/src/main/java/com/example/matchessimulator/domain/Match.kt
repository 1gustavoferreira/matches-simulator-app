package com.example.matchessimulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: Place,
    @SerializedName("Commander")
    val homeTeam: Team,
    @SerializedName("Visitor")
    val awayTeam: Team
): Parcelable
