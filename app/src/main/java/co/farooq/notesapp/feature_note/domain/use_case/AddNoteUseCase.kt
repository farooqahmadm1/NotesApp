package co.farooq.notesapp.feature_note.domain.use_case

import co.farooq.notesapp.feature_note.domain.model.InvalidNoteException
import co.farooq.notesapp.feature_note.domain.model.Note
import co.farooq.notesapp.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note : Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The title of the note content can't be empty.")
        }
        noteRepository.insertNote(note = note)
    }
}