package co.farooq.notesapp.feature_note.presentation.add_edit_note

import android.graphics.Color
import androidx.compose.ui.focus.FocusState
import co.farooq.notesapp.feature_note.domain.use_case.AddNoteUseCase

sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String) : AddEditNoteEvent()
    data class ChangeTittleFocus(val focusState: FocusState) : AddEditNoteEvent()
    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState) : AddEditNoteEvent()
    data class ChangeColor(val color: Int) : AddEditNoteEvent()
    object saveNote : AddEditNoteEvent()
}
