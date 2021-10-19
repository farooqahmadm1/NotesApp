package co.farooq.notesapp.feature_note.presentation.notes.components

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.farooq.notesapp.feature_note.domain.util.NoteOrder
import co.farooq.notesapp.feature_note.domain.util.OrderType


/**
 * Order Section for filters
 * 1- Order by Parameters
 * 2- Order by sorting
 *
 *
 * 1- callback for parameter order selection
 * 2- callback for sorting order selection
 * 3- modifier
 * 4- 2 remember state
 * 5- order object
 */


@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DefaultRadioButton(text = "Title", selected = noteOrder is NoteOrder.Title, onSelect = {
                onOrderChange(NoteOrder.Title(noteOrder.orderType))
            })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Date", selected = noteOrder is NoteOrder.Date, onSelect = {
                onOrderChange(NoteOrder.Date(noteOrder.orderType))
            })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Color", selected = noteOrder is NoteOrder.Color, onSelect = {
                onOrderChange(NoteOrder.Color(noteOrder.orderType))
            })
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Ascending))
                })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Descending",
                selected = noteOrder.orderType is OrderType.Descending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Descending))
                })
        }
    }

}