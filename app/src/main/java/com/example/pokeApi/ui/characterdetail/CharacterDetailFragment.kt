package com.example.pokeApi.ui.characterdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.pokeApi.R
import com.example.pokeApi.databinding.FragmentCharacterDetailBinding
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class CharacterDetailFragment : Fragment() {

    private lateinit var binding: FragmentCharacterDetailBinding
    private val args: CharacterDetailFragmentArgs by navArgs()
    private val viewModel: CharacterDetailViewModel by inject { parametersOf(args.characterId) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharacterDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        viewModel.sayHi()

        binding.btRegresar.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.charactersFragment, null))

        return binding.root
    }



}