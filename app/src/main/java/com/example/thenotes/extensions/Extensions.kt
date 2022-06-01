package com.example.thenotes.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Date.toDateString():String{
    val sdf = SimpleDateFormat("dd MMMM yyyy",Locale("ru"))
    return sdf.format(this)
}