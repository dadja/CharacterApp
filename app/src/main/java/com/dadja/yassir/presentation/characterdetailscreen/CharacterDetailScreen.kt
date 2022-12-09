package com.dadja.yassir.presentation.characterdetailscreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CharacterDetailScreen(
    navController : NavController,
//    viewModel: CharacterDetailViewModel= hiltViewModel()
){

//    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,) {

        Column(
            modifier=Modifier.fillMaxSize(),
//            contentPadding = PaddingValues(20.dp),
        ){
            Text(
                text = "Detail Screen ",//${state.character?.name}
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.body1.fontSize,
                fontWeight = FontWeight.Bold,
            )
        }
    }

//    if(state.error.isNotBlank()){
//        Text(text = state.error,
//            color =MaterialTheme.colors.error,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp)
////                .align(Alignment.Center)
//        )
//    }

//    if(state.isLoading){
//        Box(modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ){
//            CircularProgressIndicator(modifier = Modifier
//                .align(Alignment.Center)
//            )
//        }
//    }
}


    @Composable
    @Preview(showBackground = true)
    fun MovieListScreenPreview(){
        CharacterDetailScreen(
            navController= rememberNavController(),
        )
    }
