package com.example.pokeApi.data.network

import com.example.pokeApi.data.Result
import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.models.characters.CharactersResponse

class RemoteRickMortyDataSource(private val apiService: RickMortyApiService) : RickMortyDataSource {

    override suspend fun getCharacters(): Result<CharactersResponse> {
        return try {
            val charactersResponse = apiService.getCharacters()
            Result.Success(charactersResponse)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun getCharacterDetails(id: String): Result<CharacterDetails> {
        return try {
            val characterDetails = apiService.getCharacterDetail(id)
            Result.Success(characterDetails)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}