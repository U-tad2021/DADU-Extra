package com.amarinag.daduextraordinaria.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Character(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("status")
    @Expose
    val status: String?,
    @SerializedName("species")
    @Expose
    val species: String?,
    @SerializedName("type")
    @Expose
    val type: String?,
    @SerializedName("gender")
    @Expose
    val gender: String?,
    @SerializedName("origin")
    @Expose
    val origin: Origin?,
    @SerializedName("location")
    @Expose
    val location: Location?,
    @SerializedName("image")
    @Expose
    val image: String?,
    @SerializedName("episode")
    @Expose
    val episode: List<String?>?,
    @SerializedName("url")
    @Expose
    val url: String?,
    @SerializedName("created")
    @Expose
    val created: String?
)