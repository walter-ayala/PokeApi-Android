package com.example.pokeApi.data

import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.models.characters.CharactersResponse
import com.example.pokeApi.data.network.RickMortyDataSource

class DefaultRickMortyRepository(private val remoteDataSource: RickMortyDataSource) :
    RickMortyRepository {

    override suspend fun getCharacters(): Result<CharactersResponse> {
        return remoteDataSource.getCharacters()
    }

    override suspend fun getCharacterDetails(id: String): Result<CharacterDetails> {
        return remoteDataSource.getCharacterDetails(id)
    }

}