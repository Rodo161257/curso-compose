package com.rodolfo.cfp401.cursoappsmoviles.evergreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rodolfo.cfp401.cursoappsmoviles.evergreen.ui.theme.CursoAppsMovilesTheme

class Evergreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EvergreenApp()
        }
    }
}

@Composable
fun EvergreenApp(){

}
@Composable
fun ListadoVegetales(){

}
@Composable
fun TarjetaVegetal(vegetal: Vegetal)
