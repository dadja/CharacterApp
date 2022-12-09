package com.dadja.yassir.presentation.characterdetailscreen

import com.dadja.yassir.domain.model.CharacterDetail

data class CharacterDetailState(
    val isLoading:Boolean =false,
    val character:CharacterDetail? =null,
    val error : String = ""
)
