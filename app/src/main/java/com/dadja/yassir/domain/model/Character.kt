package com.dadja.yassir.domain.model

import com.dadja.yassir.data.remote.dto.Info

data class Character(
    val info: Info,
    val results: List<CharacterDetail>
)