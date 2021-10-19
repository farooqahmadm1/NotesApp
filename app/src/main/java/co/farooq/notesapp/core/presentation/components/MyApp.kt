package co.farooq.notesapp.core.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.farooq.notesapp.ui.theme.NotesAppTheme

@Composable
fun MyApp(content: @Composable() () -> Unit) {
    NotesAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxSize()
        ) {
            content()
        }
    }
}