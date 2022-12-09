package com.dadja.yassir.data.remote.dto

import com.dadja.yassir.domain.model.CharacterDetail
import com.dadja.yassir.domain.model.Character

class CharacterDto (
        val info: Info,
        val results: List<CharacterDetail>
)

fun CharacterDto.toCharacter(): Character {
    return Character(
        info = info,
        results = results
    )
}