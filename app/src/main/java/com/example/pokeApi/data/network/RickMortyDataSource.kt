package com.example.pokeApi.data.network

import com.example.pokeApi.data.Result
import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.models.characters.CharactersResponse

interface RickMortyDataSource {
    suspend fun getCharacters(): Result<CharactersResponse>

    suspend fun getCharacterDetails(id: String): Result<CharacterDetails>
}