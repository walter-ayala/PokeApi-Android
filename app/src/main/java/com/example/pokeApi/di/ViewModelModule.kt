package com.example.pokeApi.di

import com.example.pokeApi.ui.characterdetail.CharacterDetailViewModel
import com.example.pokeApi.ui.characters.CharactersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        CharactersViewModel(get())
    }

    viewModel { (characterId: String) ->
        CharacterDetailViewModel(get(), characterId)
    }
}