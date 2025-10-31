package com.rodolfo.cfp401.cursoappsmoviles.evergreen

import androidx.compose.material3.RadioButton
import com.rodolfo.cfp401.cursoappsmoviles.R

val listadoVegetales = listOf<Vegetal>(
    Vegetal(
        "banana",
        nombreCientifico = "Bananus Cientificus",
        imagen = R.drawable.bananas,
        "tropical, rica en K",
    ),
    Vegetal(
        nombreVulgar = "naranja",
        nombreCientifico = "Naranjus Nobillis",
        imagen = R.drawable.naranjas,
        propiedades = "templado, rica en Vit.C"

    ),
    Vegetal(
        nombreVulgar = "manzana",
        nombreCientifico = "Prunus manzanus",
        imagen = R.drawable.manzanas,
        propiedades = "clima frio, rica en minerales"

    ),
    Vegetal(
        nombreVulgar = "lechuga",
        nombreCientifico = "Lactuca sativa",
        imagen = R.drawable.lechugas,
        propiedades = "clima templado, rica en Vit.A"
    ),
    Vegetal(
        nombreVulgar = "cebolla",
        nombreCientifico = "Cebollun sativa",
        imagen = R.drawable.cebollas,
        propiedades = "clima templado, rica en Vit.E"
    ),
    Vegetal(
        nombreVulgar = "Tomate",
        nombreCientifico = "Capsicum sativus",
        imagen = R.drawable.tomates,
        propiedades = "clima templado, rico en licopeno"