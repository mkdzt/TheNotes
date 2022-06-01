package com.example.thenotes.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.thenotes.extensions.toDateString
import com.example.thenotes.model.Note
import java.util.*

@Composable
fun NotesItem(modifier: Modifier, note: Note){
    Card(
        modifier = modifier,
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            ItemBody(
                title = note.title,
                text = note.text
            )
            ItemMetaDataFunctions(
                metadata = note.date.toDateString(),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}

@Preview
@Composable
fun NotesItemPreview(){
    NotesItem(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        note = Note(id = 1, title = "Title", text = "Text", date = Date())
    )
}