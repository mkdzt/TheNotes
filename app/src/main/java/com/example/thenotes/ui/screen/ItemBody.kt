package com.example.thenotes.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ItemBody(title:String, text:String){
    Row {
        //TODO add item image
        Column {
            ItemTitle(
                title = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
            ItemText(
                text = text,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}