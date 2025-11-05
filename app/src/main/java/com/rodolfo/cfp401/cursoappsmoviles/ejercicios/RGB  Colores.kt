package com.tutorialesprogramacionya.compose7b

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun PantallaPrincipal() {
    var rojo by remember { mutableStateOf(0) }
    var verde by remember { mutableStateOf(0) }
    var azul by remember { mutableStateOf(0) }
    Column() {
        LazyRow() {
            items(256) { indice ->
                Button(
                    shape = RoundedCornerShape(0),
                    modifier = Modifier.height(100.dp),
                    onClick = {
                        rojo = indice
                    },
                    colors = ButtonDefaults.textButtonColors(
                        Color(indice, 0, 0),
                    )
                )
                {
                    Text(text = "$indice", color = Color.White)
                }
            }
        }
        LazyRow() {
            items(256) { indice ->
                Button(
                    shape = RoundedCornerShape(0),
                    modifier = Modifier.height(100.dp),
                    onClick = { verde = indice },
                    colors = ButtonDefaults.textButtonColors(
                        Color(0, indice, 0),
                    )
                )
                {
                    Text(text = "$indice", color = Color.White)
                }
            }
        }
        LazyRow() {
            items(256) { indice ->
                Button(
                    shape = RoundedCornerShape(0),
                    modifier = Modifier.height(100.dp),
                    onClick = { azul = indice },
                    colors = ButtonDefaults.textButtonColors(
                        Color(0, 0, indice),
                    )
                )
                {
                    Text(text = "$indice", color = Color.White)
                }
            }
        }
        Button(
            shape = RoundedCornerShape(0),
            modifier = Modifier.fillMaxSize(),
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                Color(rojo, verde, azul),
            )
        )
        {
            Column() {
                SelectionContainer {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "rgb($rojo,$verde,$azul)", fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color(255 - rojo, 255 - verde, 255 - azul)
                    )
                }
                SelectionContainer() {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "#${rojo.toString(16).padStart(2, '0').uppercase()}${
                            verde.toString(16).padStart(2, '0').uppercase()
                        }${azul.toString(16).padStart(2, '0').uppercase()}", fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color(255 - rojo, 255 - verde, 255 - azul)
                    )
                }
            }
        }
    }
}