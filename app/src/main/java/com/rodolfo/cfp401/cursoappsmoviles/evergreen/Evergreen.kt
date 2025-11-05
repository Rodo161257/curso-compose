package com.rodolfo.cfp401.cursoappsmoviles.evergreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showSystemUi = true)
@Composable
fun PrevisualizacionApp() {
    EvergreenApp(listadoVegetales)
}

@Composable
fun EvergreenApp(listadoVegetal: List<Vegetal>) {
    ListadoVegetales(listadoVegetal)
}

@Composable
fun ListadoVegetales(lista: List<Vegetal>) {
    LazyColumn() {
        items(lista) { vegetal ->
            TarjetaVegetal(vegetal)
        }
    }
}

@Composable
fun TarjetaVegetal(vegetal: Vegetal) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = vegetal.nombreVulgar,
            fontSize = 50.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = vegetal.nombreCientifico,
            fontSize = 40.sp,
            modifier = Modifier.padding(1.dp)

        )

        Image(
            painter = painterResource(id = vegetal.imagen),
            vegetal.nombreVulgar,
            modifier = Modifier.size(400.dp)
        )

        Text(
            text = vegetal.propiedades,
            fontSize = 30.sp,
            modifier = Modifier.padding(1.dp)
        )
    }
}



