package com.rodolfo.cfp401.cursoappsmoviles.ejercicios

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        for (i in 1.. 100){
        delay(100000)
        println("$i")

    }
        readLine()
    }

}
