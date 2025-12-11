package com.example.box001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.box001.ui.theme.Box001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box001Theme {
                CuadrantesPantalla()
            }
        }
    }
}

@Composable
fun CuadrantesPantalla() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Fila superior
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Este contenedor representa la parte superior izquierda. Usamos Box para colocar contenido y darle un color de fondo.",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Este contenedor representa la parte superior derecha. Es otra Box que ocupa la mitad de la fila y tiene un fondo amarillo.",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }

        // Fila inferior
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Este contenedor representa la parte inferior izquierda. Aquí usamos Box para practicar cómo centrar contenido en Compose.",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Este contenedor representa la parte inferior derecha. Se muestra cómo un Box puede contener texto y un color de fondo diferente.",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCuadrantes() {
    CuadrantesPantalla()
}

