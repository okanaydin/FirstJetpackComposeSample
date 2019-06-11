package com.example.firstjetpackcomposesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { SimpleComposable() }
    }
}
