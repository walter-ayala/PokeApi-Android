package com.example.pokeApi.data.models.characters


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharactersResponse(
    val results: List<Character>?
)