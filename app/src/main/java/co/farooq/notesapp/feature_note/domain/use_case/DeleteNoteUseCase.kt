package co.farooq.notesapp.feature_note.domain.use_case

import co.farooq.notesapp.feature_note.domain.model.Note
import co.farooq.notesapp.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val repository: NoteRepository
){

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note = note)
    }
}