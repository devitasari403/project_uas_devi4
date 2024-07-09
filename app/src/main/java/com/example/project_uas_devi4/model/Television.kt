package com.example.project_uas_devi4.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Television(
    @SerializedName("id")
    val id : String ? ="",

    @SerializedName("name")
    val title : String? ="",

    @SerializedName("poster_path")
    val poster : String? ="",

    @SerializedName("overview")
    val overview : String? =""

) : Parcelable