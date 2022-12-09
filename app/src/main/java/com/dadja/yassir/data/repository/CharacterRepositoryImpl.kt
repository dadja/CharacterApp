package com.dadja.yassir.data.repository

import com.dadja.yassir.data.remote.dto.*
import com.dadja.yassir.domain.model.Character
import com.dadja.yassir.domain.model.CharacterDetail
import com.dadja.yassir.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api:ApiCharactersApp
): CharacterRepository {
    override suspend fun getCharacters(): Character {//List<Movie>
        val data = api.getCharacters("1")
        return data.toCharacter()
            //.results.map { it.toMovie() }
    }

//    override suspend fun getCharacterDetail(movieId: String): CharacterDetail {
//        val movie = api.getCharacterDetail(movieId)
//        return movie.toCharacterDetail()
//    }


}