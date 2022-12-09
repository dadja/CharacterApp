package com.dadja.yassir.domain.use_case.getcharacters

import com.dadja.yassir.common.Resource
import com.dadja.yassir.domain.model.Character
import com.dadja.yassir.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import retrofit2.HttpException
import java.io.IOException


class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator  fun invoke ():Flow<Resource<Character>> = flow {
        try{
            emit(Resource.Loading())
            val data = repository.getCharacters()
            emit(Resource.Success(data))//we should dwork on the pagination later....
        }catch (e : HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexcepted error occured"))
        }catch(e : IOException){
            emit(Resource.Error(e.localizedMessage?:"Couldn't reach server check your internet connection"))
        }
    }

}