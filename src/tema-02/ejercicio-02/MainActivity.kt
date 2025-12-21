package com.example.box002

import android.R.attr.contentDescription
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenBox002() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.compose_header),
                contentDescription = "Compose Header",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            );

            Row {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),

                    )
                Text(
                    text = "Hola, Bienvenido al mejor tutorial de Jetpack Compose",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Magenta
                    )
                )
            }

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = "Este tutorial está pensado para que pierdas el miedo a Jetpack Compose mientras juegas con Box, Column y Row. Si algo no sale a la primera, no pasa nada: refresca la Preview, respira hondo y sigue probando, que así es como se aprende de verdad.",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Italic
                )
            )

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red,
                        contentColor = Color.LightGray
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "Favorito"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Comenzar")
                }

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Divider(
                    modifier = Modifier.width(30.dp),
                    thickness = 1.dp,
                    color = Color.Blue
                )

                Text(
                    text = "Encuéntranos en las Redes Sociales",
                    color = Color.Blue,
                    modifier = Modifier.padding(4.dp)
                )

                Divider(
                    modifier = Modifier.width(30.dp),
                    thickness = 1.dp,
                    color = Color.Blue
                )
            }


            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedButton(
                    onClick = { },
                    modifier = Modifier.width(260.dp),
                    border = BorderStroke(1.dp, Color.Blue),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.White,
                        contentColor = Color.Blue
                    )
                ) {
                    Text(text = "Facebook")
                }

                Spacer(modifier = Modifier.height(5.dp))

                OutlinedButton(
                    onClick = { },
                    modifier = Modifier.width(260.dp),
                    border = BorderStroke(1.dp, Color.Red),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.White,
                        contentColor = Color.Red
                    )
                ) {
                    Text(text = "Instagram")
                }


            }




        }

    }

}


@Preview(name = "Box002", showSystemUi = true)
@Composable
fun ScreenBox002Preview() {
    ScreenBox002();
}

