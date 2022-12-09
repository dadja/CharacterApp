package com.dadja.yassir.domain.repository

import com.dadja.yassir.domain.model.CharacterDetail
import com.dadja.yassir.domain.model.Character

interface  CharacterRepository {

    suspend fun getCharacters():Character //
//    suspend fun getCharacterDetail(movieId: String): CharacterDetail

}