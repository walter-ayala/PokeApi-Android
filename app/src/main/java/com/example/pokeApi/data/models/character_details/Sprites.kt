package com.example.pokeApi.data.models.character_details

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sprites(
    val front_default: String?
)
