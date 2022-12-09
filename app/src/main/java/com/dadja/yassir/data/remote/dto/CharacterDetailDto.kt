package com.dadja.yassir.data.remote.dto

import com.dadja.yassir.domain.model.CharacterDetail

data class CharacterDetailDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun CharacterDetailDto.toCharacterDetail(): CharacterDetail {
    return CharacterDetail(
     created= created,
     episode =episode,
     gender = gender,
     id = id,
     image = image,
     location = location,
     name = name,
     origin = origin,
     species = species,
     status =status,
     type = type,
     url = url
    )
}
