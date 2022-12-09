package com.dadja.yassir.presentation.characterslistscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
//import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dadja.yassir.presentation.Screen
import com.dadja.yassir.presentation.characterslistscreen.components.CharacterListItem
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.gson.Gson


@Composable
fun CharactersListScreen(
    navController : NavController,
    viewModel : CharactersListViewModel = hiltViewModel()
    ) {
   val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
    ){

        LazyColumn(modifier =Modifier.fillMaxSize()){
            items(state.characters){
                mycharacter ->
                run {
                    CharacterListItem(character = mycharacter,
                        onItemClick = {
                            var gson = Gson()
                            var user = gson.toJson(mycharacter)
                        navController.navigate("character_detail_screen/"+user)
                    }
                    )
                }
            }
        }
    }

    if(state.error.isNotBlank()){
        Text(text = state.error,
        color =MaterialTheme.colors.error,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
//                .align(Alignment.Center)
            )
    }

    if(state.isLoading){
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            CircularProgressIndicator(modifier = Modifier
            .align(Alignment.Center)
        )
        }
    }
}



//@Composable
//fun MovieListScreen(){
//    Box(modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center,) {
//        Text(
//            text = "ListView Screen",
//            color = MaterialTheme.colors.primary,
//            fontSize = MaterialTheme.typography.body1.fontSize,
//            fontWeight = FontWeight.Bold,
//        )
//    }
//}


//@Composable
//@Preview(showBackground = true)
//fun MovieListScreenPreview(){
//    MovieListScreen(
//        navController = N,
//    )
//}



