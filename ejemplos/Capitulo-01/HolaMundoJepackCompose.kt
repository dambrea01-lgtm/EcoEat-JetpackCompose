package com.example.composecoursebasic.examples

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class HolaMundoJepackCompose{

    @Composable
    fun Saludo() {
        Text(text = "Hola Mundo 👋")
    }

    // Preview para ver el resultado en Android Studio
    @Preview(showBackground = true)
    @Composable
    fun PreviewSaludo() {
        Saludo()
    }
}
