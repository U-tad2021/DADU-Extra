package com.amarinag.daduextraordinaria.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Origin(
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("url")
    @Expose
    val url: String?
)