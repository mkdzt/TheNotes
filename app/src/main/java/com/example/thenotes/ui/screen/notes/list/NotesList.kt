package com.example.thenotes.ui.screen.notes.list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thenotes.model.Note
import java.util.*
import kotlin.collections.ArrayList

@Composable
fun ListNoteColumn(notes:ArrayList<Note>,modifier: Modifier){
    val listState = rememberLazyListState()
    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
    ){
        items(notes){ note->
            ItemNote(
                note = note,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}

@Composable
@Preview
fun ListNoteColumnPreview(){
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .fillMaxSize()
    ){
        items(15){
            ItemNote(
                note = Note(it.toLong(),"Title${it}","Text${it}",Date()),
                modifier = Modifier
            )
        }
    }
}