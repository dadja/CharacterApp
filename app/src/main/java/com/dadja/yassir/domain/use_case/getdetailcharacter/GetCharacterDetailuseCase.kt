package com.dadja.yassir.domain.use_case.getdetailcharacter

import com.dadja.yassir.common.Resource
import com.dadja.yassir.domain.model.CharacterDetail
import com.dadja.yassir.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

//class GetCharacterDetailUseCase @Inject constructor(
//    private val repository: CharacterRepository
//) {
//    operator  fun invoke (movieId :String): Flow<Resource<CharacterDetail>> = flow {
//        try{
//            emit(Resource.Loading())
//            val movieDetail = repository.getCharacterDetail(movieId)
//            emit(Resource.Success(movieDetail))//we should work on the pagination later....
//        }catch (e : HttpException){
//            emit(Resource.Error(e.localizedMessage ?: "An unexcepted error occured"))
//        }catch(e : IOException){
//            emit(Resource.Error(e.localizedMessage?:"Couldn't reach server check your internet connection"))
//        }
//    }
//
//}