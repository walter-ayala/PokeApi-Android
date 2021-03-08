package com.example.pokeApi.data.models.character_details

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Move(
    val name: String?
)
