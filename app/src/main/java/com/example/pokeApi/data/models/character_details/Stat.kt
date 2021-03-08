package com.example.pokeApi.data.models.character_details

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stat(
    val name: String?
)
