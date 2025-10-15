package com.rodolfo.cfp401.cursoappsmoviles

import android.media.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun PrevisualizacionTabla() {
    TablaDeMultiplicar(7)
}

@Preview(showBackground = true)
@Composable
fun PrevisualizacionTablas() {
    FlowColumn {
        for (i in 1..10)
            TablaDeMultiplicar(i)
    }
}

@Composable
fun TablaDeMultiplicar(table: Int) {
    Column(Modifier.padding(10.dp)) {
        for (i in 1..10)
            Text("$table*$i = ${table * i}")
    }
}