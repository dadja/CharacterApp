package com.dadja.yassir.presentation.characterslistscreen

import com.dadja.yassir.domain.model.CharacterDetail

data class CharactersListState(
    val isLoading:Boolean =false,
    val characters:List<CharacterDetail> = emptyList(),
    val error : String = ""
)
