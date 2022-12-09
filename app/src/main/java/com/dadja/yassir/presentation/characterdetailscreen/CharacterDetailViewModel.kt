//package com.dadja.yassir.presentation.characterdetailscreen
//
//import androidx.compose.runtime.State
//import androidx.compose.runtime.mutableStateOf
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.dadja.yassir.common.Resource
////import com.dadja.yassir.domain.use_case.getdetailcharacter.GetCharacterDetailUseCase
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.launchIn
//import kotlinx.coroutines.flow.onEach
//import javax.inject.Inject
//
//
////@HiltViewModel
////class CharacterDetailViewModel @Inject constructor(
////    private val getMovieDetailUseCase: GetCharacterDetailUseCase,
////    character:String
////): ViewModel() {
//
////    private val _state = mutableStateOf(CharacterDetailState())
////    val state : State<CharacterDetailState> = _state
//
//    init {
////        getMovieDetail("2")
//    }
//
////    private fun getMovieDetail(movieid:String){
////        getMovieDetailUseCase(movieid).onEach {
////                result->when(result){
////                    is Resource.Success -> {
////                        _state.value = CharacterDetailState(character = result.data)
////                    }
////                    is Resource.Error ->{
////                        _state.value = CharacterDetailState(
////                            error = result.message ?: "An excepted error occured "
////                        )
////                    }
////                    is Resource.Loading->{
////                        _state.value = CharacterDetailState(isLoading = true)
////                    }
////        }
////        }.launchIn(viewModelScope)
////    }
////}