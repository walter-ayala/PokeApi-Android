package com.example.pokeApi.data.models.character_details


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacterDetails(
    val id:Int?,
    val name: String?,
    val height: Int?,
    val base_experience: Int?,
    val weight: Int?,
    val sprites: Sprites?,
    val stats: List<Stats>?,
    val imagen: String= "https://pokeres.bastionbot.org/images/pokemon/$id.png",
    val abilities: List<Abilities>?,
    val moves: List<Moves>?
)