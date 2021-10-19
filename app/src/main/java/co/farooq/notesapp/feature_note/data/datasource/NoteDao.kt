package co.farooq.notesapp.feature_note.data.datasource

import androidx.room.*
import co.farooq.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM NOTE WHERE id = :id")
    suspend fun getNoteById(id : Int) : Note?

    @Query("SELECT * FROM NOTE")
    fun getNotes() : Flow<List<Note>>
}