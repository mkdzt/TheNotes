package com.example.thenotes.ui.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ItemTitle(title:String,modifier:Modifier){
    Text(
        text = title,
        modifier = modifier,
        color = Color.Black,
        fontSize = 30.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.SansSerif,
        overflow = TextOverflow.Ellipsis,
        maxLines = 2
    )
}