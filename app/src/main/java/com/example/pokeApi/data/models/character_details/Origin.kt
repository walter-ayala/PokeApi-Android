package com.example.pokeApi.data.models.character_details


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Origin(
    val name: String?,
    val url: String?
)