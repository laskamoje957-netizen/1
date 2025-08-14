package cz.vaclav.prompttoapk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    AppScreen()
                }
            }
        }
    }
}

@Composable
fun AppScreen() {
    var text by remember { mutableStateOf("") }
    val items = remember { mutableStateListOf<String>() }

    Column(Modifier.padding(16.dp)) {
        Text("PromptToAPK – Starter", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(12.dp))
        OutlinedTextField(value = text, onValueChange = { text = it }, label = { Text("Zadej text") })
        Spacer(Modifier.height(8.dp))
        Button(onClick = {
            if (text.isNotBlank()) { items.add("$text • ${java.time.LocalTime.now()}"); text = "" }
        }) { Text("Přidat") }
        Spacer(Modifier.height(16.dp))
        items.forEach { Text(it) }
    }
}
