package co.farooq.notesapp.feature_note.presentation.notes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import co.farooq.notesapp.feature_note.domain.model.Note


/**
 * 1- note to show text, description, color
 * 2- delete callback -> to delete item
 * 3- onclick Callback -> to view item
 * 4- modifier
 * 5- corner radius
 * 6 -cut corner radius
 */


@Composable
fun NoteItem(
    note: Note,
    modifier: Modifier = Modifier,
    cornerRadius: Dp,
    onDeleteClick: (Note) -> Unit,
) {
    Box(
        modifier = modifier.padding(bottom = 8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(note.color), shape = RoundedCornerShape(cornerRadius))
                .padding(16.dp)
                .padding(end = 32.dp),
        ) {
            Text(
                text = note.title,
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = note.content,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                maxLines = 7,
                overflow = TextOverflow.Ellipsis
            )
        }
        IconButton(
            modifier = Modifier.align(Alignment.BottomEnd),
            onClick = { onDeleteClick(note) }
        ) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Note")
        }
    }
}