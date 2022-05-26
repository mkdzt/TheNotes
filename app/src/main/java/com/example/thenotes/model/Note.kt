package com.example.thenotes.model

import java.util.*

data class Note(
    val id:Long,
    val title:String,
    val text:String,
    val date: Date = Date()
)
