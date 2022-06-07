package com.example.thenotes.ui.screen.notes.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thenotes.extensions.toDateString
import com.example.thenotes.model.Note
import java.util.*

@Composable
fun ItemNote(modifier: Modifier, note: Note){
    Card(
        modifier = modifier,
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
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
fun ItemNotePreview(){
    ItemNote(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        note = Note(id = 1, title = "Title", text = "Text", date = Date())
    )
}