package com.dadja.yassir.domain.model

import com.dadja.yassir.data.remote.dto.Location
import com.dadja.yassir.data.remote.dto.Origin

data class CharacterDetail(
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





