package com.example.firstjetpackcomposesample

import androidx.compose.*
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

@Composable
fun SimpleComposable() {
    MaterialTheme {
        Text(text = "Hello Okan !", style = +themeTextStyle { h1 })
    }
}