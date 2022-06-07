package com.example.thenotes.ui.screen.notes.list

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun ItemText(text:String,modifier: Modifier){
    Text(
        text = text,
        modifier = modifier,
        color = Color.Black,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = FontFamily.SansSerif,
        overflow = TextOverflow.Ellipsis,
        maxLines = 2
    )
}