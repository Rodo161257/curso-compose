package com.rodolfo.cfp401.cursoappsmoviles

import android.R.attr.fontFamily
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.internal.enableLiveLiterals
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rodolfo.cfp401.cursoappsmoviles.ui.theme.CursoAppsMovilesTheme
import kotlinx.coroutines.sync.Mutex
import java.lang.Compiler.enable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CursoAppsMovilesTheme {
                Surface {
                    Listado()
                }
            }
        }
    }
}

//@Preview(showSystemUi = false)
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

//@Preview(showSystemUi = false)
@Composable
fun Previsualizacion() {
    CursoAppsMovilesTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {

            Listado()
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
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(12.dp)
    ) {
        Row {
            Arbol()
            Saludo("CFP 401 LV")
        }
        Spacer(Modifier.height(6.dp))
        Boton()
    }
}

@Composable
fun Arbol() {
    Image(
        painterResource(R .drawable.arbol),
        "Icono de Android",
        Modifier
            .size(200.dp)
            .clip(RectangleShape)
            .border(8.dp, MaterialTheme.colorScheme.outline, RectangleShape)

    )
}

@Composable
fun Saludo(lugar: String) {
    Column {
        Text(
            "Hola Mundo desde $lugar!",
            fontSize = 30.sp,
            fontFamily = FontFamily(Font(R.font.chetta_vissto_ii))
        )
        Spacer(Modifier.height(5.dp))
        Text(text = "Miarbol?", fontSize = 30.sp)

        Text(
            text = "Preparado?",
            fontSize = 50.sp,
            fontFamily = FontFamily(Font(R.font.fortalesia_plain))
        )

    }

}

@Composable
fun Boton() {
    var contador = remember { mutableStateOf(0) }
    Button(
        onClick = { contador.value++ },
        colors = ButtonColors(Color.Black, Color.White, Color.Gray, Color.Black),
        enabled = true
    ) {
        Text("Click me ${contador.value}")
    }
}

@Preview(showBackground = true)
@Composable
fun ControlCantidad() {
    var contador = remember { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Decremento(contador)
            Text("${contador.value}", fontSize = 40.sp)
            Incremento(contador)
        }
        Reseteo(contador)
    }
}@Composable
fun Incremento(contador: MutableState<Int>) {
    Button(onClick = { contador.value++ }) { Text("+") }
}@Composable
fun Decremento(contador: MutableState<Int>) {
    Button(onClick = { if (contador.value > 0) contador.value-- }) { Text("-") }
}@Composable
fun Reseteo(contador: MutableState<Int>) {
    Button(onClick = { contador.value = 0 }) {
        Text("RESET")
    }
}