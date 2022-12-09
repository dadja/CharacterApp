package com.dadja.yassir.presentation.characterslistscreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dadja.yassir.common.Resource
import com.dadja.yassir.domain.use_case.getcharacters.GetCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    private val getMoviesUseCase: GetCharactersUseCase
):ViewModel(){

private val _state = mutableStateOf(CharactersListState())
    val state : State<CharactersListState> = _state

    init {
        getCharacters()
    }

    private fun getCharacters(){
        getMoviesUseCase().onEach {
            result->when(result){
                    is Resource.Success -> {
                   _state.value = CharactersListState(characters = result.data?.results?: emptyList())
                }
                is Resource.Error ->{
                    _state.value = CharactersListState(
                        error = result.message ?: "An excepted error occured "
                    )
                }
                is Resource.Loading->{
                    _state.value = CharactersListState(isLoading =true)
                }
            }
        }.launchIn(viewModelScope)
    }

}