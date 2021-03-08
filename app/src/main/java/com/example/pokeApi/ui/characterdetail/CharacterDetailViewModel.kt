package com.example.pokeApi.ui.characterdetail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokeApi.data.RickMortyRepository
import com.example.pokeApi.data.getData
import com.example.pokeApi.data.getError
import com.example.pokeApi.data.models.character_details.CharacterDetails
import com.example.pokeApi.data.succeeded
import com.example.pokeApi.utils.LoadingStatus
import kotlinx.coroutines.launch

class CharacterDetailViewModel(
    private val repository: RickMortyRepository,
    private val characterId: String
) : ViewModel() {

    private val _character = MutableLiveData<CharacterDetails>()
    val character: LiveData<CharacterDetails>
        get() = _character

    private val _loadingStatus = MutableLiveData<LoadingStatus>()
    val loadingStatus: LiveData<LoadingStatus>
        get() = _loadingStatus

    private val _characterDetailErrorMessage = MutableLiveData<String>()
    val characterDetailErrorMessage: LiveData<String>
    get() = _characterDetailErrorMessage


    init {
        getCharacterDetail()
    }

    fun sayHi() {
        Log.i("CharacterDetailViewMode", "Character ID: $characterId")
    }

    private fun getCharacterDetail() {
        viewModelScope.launch {
            _loadingStatus.value = LoadingStatus.LOADING

            val characterDetails = repository.getCharacterDetails(characterId)

            if (characterDetails.succeeded) {
                _character.value = characterDetails.getData()
                Log.i("CharacterDetailVM", characterDetails.getData().name ?: "Funciona")
                _loadingStatus.value = LoadingStatus.SUCCESS
            } else {
                _characterDetailErrorMessage.value = characterDetails.getError().message
                _loadingStatus.value = LoadingStatus.ERROR
            }
        }
    }

}