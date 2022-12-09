package com.dadja.yassir.data.remote.dto

import com.dadja.yassir.common.CharacterAppConst

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiCharactersApp {

    @GET(CharacterAppConst.getCharacters)
    suspend fun getCharacters(@Query("page") page:String) : CharacterDto

//    @GET(CharacterAppConst.getCharacterDetail)
//    suspend fun getCharacterDetail(@Path("id") id:String ) : CharacterDetailDto
}