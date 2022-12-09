package com.dadja.yassir.presentation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.dadja.yassir.presentation.characterdetailscreen.CharacterDetailScreen
import com.dadja.yassir.presentation.characterslistscreen.CharactersListScreen


@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination=Screen.CharactersListScreen.route,
    ){

        composable(
            route = Screen.CharactersListScreen.route
        ){
            CharactersListScreen(
                navController= navController,
            )
        }

        composable(
            route = Screen.CharacterDetailScreen.route,
            arguments = listOf(navArgument("user") {
                type = NavType.StringType
            })
        ){
            Log.d("APPCHARACTERValueArgs",it.arguments?.getString("user").toString())
            CharacterDetailScreen(
                navController= navController,
            )
        }
    }
}