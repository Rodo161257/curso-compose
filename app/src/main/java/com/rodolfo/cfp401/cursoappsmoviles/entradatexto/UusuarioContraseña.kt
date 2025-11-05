package com.rodolfo.cfp401.cursoappsmoviles.entradatexto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun Login() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        var usuario by remember { mutableStateOf("") }
        var clave by remember { mutableStateOf("") }
        var resultado by remember {mutableStateOf("Sin resultado")}
        OutlinedTextField (
            value = usuario,
            onValueChange = { texto ->
                usuario = texto
            },
            label = {
                Text("Nombre de usuario")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            singleLine = true
        )
        OutlinedTextField (
            value = clave,
            onValueChange = {texto ->
                clave = texto
            },
            label = {
                Text("Clave")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = {
                var cadena = ""
                if (clave.length  < 10)
                    cadena += "La clave debe tener al menos 10 caracteres\n"
                if (usuario.length == 0)
                    cadena += "No puede dejar el usuario vacio"
                resultado = cadena
            },
            modifier = Modifier.padding(30.dp)
        ) {
            Text(text = "Confirmar")
        }
        Text(
            text = resultado,
            modifier = Modifier.padding(20.dp)
        )
    }
}
/*
package com.tutorialesprogramacionya.compose7b
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaPrincipal()
        }
    }
}

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
                        backgroundColor = Color(indice, 0, 0),
                    )
                )
                {
                    Text(text = "$indice",color= Color.White)
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
                        backgroundColor = Color(0, indice, 0),
                    )
                )
                {
                    Text(text = "$indice",color= Color.White)
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
                        backgroundColor = Color(0, 0, indice),
                    )
                )
                {
                    Text(text = "$indice",color= Color.White)
                }
            }
        }
        Button(
            shape = RoundedCornerShape(0),
            modifier = Modifier.fillMaxSize(),
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(rojo, verde, azul),
            )
        )
        {
            Column() {
                SelectionContainer {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "rgb($rojo,$verde,$azul)", fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color(255-rojo,255-verde,255-azul)
                    )
                }
                SelectionContainer() {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "#${rojo.toString(16).padStart(2, '0').uppercase()}${
                            verde.toString(16).padStart(2, '0').uppercase()
                        }${azul.toString(16).padStart(2, '0').uppercase()}", fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color(255-rojo,255-verde,255-azul)
                    )
                }
            }
        }
    }
}

 */
