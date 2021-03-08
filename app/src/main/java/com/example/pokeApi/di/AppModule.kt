package com.example.pokeApi.di

import com.example.pokeApi.data.DefaultRickMortyRepository
import com.example.pokeApi.data.RickMortyRepository
import com.example.pokeApi.data.network.RemoteRickMortyDataSource
import com.example.pokeApi.data.network.RickMortyApiService
import com.example.pokeApi.data.network.RickMortyDataSource
import org.koin.dsl.module

val appModule = module {

    fun createRepository(remoteDataSource: RickMortyDataSource): RickMortyRepository {
        return DefaultRickMortyRepository(remoteDataSource)
    }

    fun createDataSource(apiService: RickMortyApiService): RickMortyDataSource {
        return RemoteRickMortyDataSource(apiService)
    }

    // Singleton para el data source
    single { createDataSource(get()) }

    // Singleton para el repository
    single { createRepository(get()) }
}