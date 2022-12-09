package com.dadja.yassir.presentation.characterslistscreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dadja.yassir.domain.model.CharacterDetail


@Composable
fun  CharacterListItem(
    character: CharacterDetail,
    onItemClick:(CharacterDetail)->Unit
    ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(character) }
            .padding(20.dp)
    ){

        AsyncImage(model = character.image, contentDescription = "Character Image")
         Text(
             text = "${character.name} ${character.id}",
             style = MaterialTheme.typography.body1,
             overflow = TextOverflow.Ellipsis,
         )
    }
}