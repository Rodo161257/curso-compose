package com.rodolfo.cfp401.cursoappsmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rodolfo.cfp401.cursoappsmoviles.ui.theme.CursoAppsMovilesTheme
import kotlinx.coroutines.sync.Mutex

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CursoAppsMovilesTheme {
                Surface {
                    Tarjeta()
                }
            }
        }
    }
}

@Preview(showSystemUi = false)
@Composable
fun Previsualizacion2() {
    CursoAppsMovilesTheme(
        darkTheme = true
    ) {
        Surface {
            Tarjeta()
        }
    }
}

@Preview(showSystemUi = false)
@Composable
fun Previsualizacion() {
    CursoAppsMovilesTheme {
        Surface (
            color = MaterialTheme.colorScheme.background
        ){

            Tarjeta()
        }
    }
}

@Composable
fun Listado() {

    val scrollState = rememberScrollState()
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Tarjeta()
        Tarjeta()
        Tarjeta()
        Tarjeta()
        Tarjeta()
        Tarjeta()
        Tarjeta()
    }
}

@Composable
fun Tarjeta() {
    Column {
        Gatorojo()
        Spacer(Modifier.width(100.dp))
        Saludo("CFP 401 LV")
    }
}

@Composable
fun Gatorojo() {
    Image(
        painterResource(R.drawable.gato_rojo),
        "Icono de Android",
        Modifier
            .size(300.dp)
            .clip(RectangleShape)
            .border(8.dp, MaterialTheme.colorScheme.outline, RectangleShape)

    )
}

@Composable
fun Saludo(lugar: String) {
    Column {
        Text("Hola Mundo desde $lugar!", fontSize = 30.sp)
        Spacer(Modifier.height(5.dp))
        Text(text = "Migato?", fontSize = 30.sp)
        Text(text = "Preparado?", color = Color.Blue, fontSize = 20.sp)
        Text(text = "Preparado?", color = Color.Red, fontSize = 20.sp)
        Text(text = "Preparado?", color = Color.Blue, fontSize = 20.sp)
        Text(text = "Preparado?", fontSize = 20.sp)

    }

}
