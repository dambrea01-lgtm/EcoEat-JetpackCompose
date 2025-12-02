package com.example.jetpackcomposecoursebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposable()
        }
    }
}

@Composable
fun MyFirstComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Hola! Soy Brea developer")
        Text(text = "Hola! Soy Brea EEEEEEEEEEEEEEEEEEEE")
        Text("Hola Brea Developer BBBBBBBBB")
    }
}

@Composable
fun DataRow() {
    Row(
        Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Button(onClick = { }) { Text("Button 1") }
        Button(onClick = { }) { Text("Button 2") }
        Button(onClick = { }) { Text("Button 3") }
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Red),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { }) { Text("Button 1") }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { }) { Text("Button 2") }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { }) { Text("Button 3") }
        }
    }
}


@Preview(name = "My Preview", showBackground = true, showSystemUi = true)
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}

@Preview(name = "My Preview", showBackground = true, showSystemUi = true)
@Composable
fun MyRowPreview() {
    DataRow()
}

@Preview(name = "My Preview", showBackground = true, showSystemUi = true)
@Composable
fun MyBoxPreview() {
    MyBox()
}

