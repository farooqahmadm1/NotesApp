package co.farooq.notesapp.feature_note.presentation.add_edit_note

sealed class NoteUiEvent{
    data class ShowSnackBar(val message : String) : NoteUiEvent()
    object SaveNote : NoteUiEvent()
}
