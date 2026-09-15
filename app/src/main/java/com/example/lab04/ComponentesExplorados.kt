package com.example.lab04

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

@Composable
fun CardDemo() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Título de la tarjeta", fontWeight = FontWeight.Bold)
            Text("Descripción breve del contenido.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardDemoPreview() { CardDemo() }

@Composable
fun SwitchDemo() {
    var activado by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Notificaciones")
        Spacer(modifier = Modifier.width(8.dp))
        Switch(checked = activado, onCheckedChange = { activado = it })
    }
}

@Preview(showBackground = true)
@Composable
fun SwitchDemoPreview() { SwitchDemo() }