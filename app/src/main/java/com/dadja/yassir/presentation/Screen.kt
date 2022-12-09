package com.dadja.yassir.presentation

sealed class Screen(val route: String ){
    object CharactersListScreen : Screen("characters_list_screen")
    object CharacterDetailScreen : Screen("character_detail_screen/{user}")
}
