package com.rodolfo.cfp401.cursoappsmoviles.evergreen

import androidx.compose.material3.RadioButton
import com.rodolfo.cfp401.cursoappsmoviles.R

val listadoVegetales = listOf<Vegetal>(
    Vegetal(
        nombreVulgar = "Banana",
        nombreCientifico = "Musa paradisíaca",
        imagen = R.drawable.bananas,
        "Clima tropical, rica en K",
    ),
    Vegetal(
        nombreVulgar = "Naranja",
        nombreCientifico = "Citrus sinensis",
        imagen = R.drawable.naranjas,
        propiedades = "Cliama templado, rica en Vit.C"

    ),
    Vegetal(
        nombreVulgar = "Manzana",
        nombreCientifico = "Malus doméstica",
        imagen = R.drawable.manzanas,
        propiedades = "Clima frio, rica en minerales"

    ),
    Vegetal(
        nombreVulgar = "Lechuga",
        nombreCientifico = "Lactuca sativa",
        imagen = R.drawable.lechugas,
        propiedades = "Clima templado, rica en Vit.A"
    ),
    Vegetal(
        nombreVulgar = "Cebolla",
        nombreCientifico = "Allium cepa",
        imagen = R.drawable.cebollas,
        propiedades = "Clima templado, rica en Vit.E"
    ),
    Vegetal(
        nombreVulgar = "Tomate",
        nombreCientifico = "Solanum lycopersicum",
        imagen = R.drawable.tomates,
        propiedades = "Clima templado, rico en licopeno"
    )
)