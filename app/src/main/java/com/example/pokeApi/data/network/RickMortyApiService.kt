package com.example.pokeApi.data.network

import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.models.characters.CharactersResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface RickMortyApiService {
    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("pokemon")
    suspend fun getCharacters(): CharactersResponse


    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("pokemon/{id}")
    suspend fun getCharacterDetail(@Path("id") id: String): CharacterDetails
}