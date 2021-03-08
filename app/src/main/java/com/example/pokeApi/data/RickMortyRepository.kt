package com.example.pokeApi.data

import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.models.characters.CharactersResponse

interface RickMortyRepository {
    suspend fun getCharacters(): Result<CharactersResponse>
    suspend fun getCharacterDetails(id: String): Result<CharacterDetails>
}