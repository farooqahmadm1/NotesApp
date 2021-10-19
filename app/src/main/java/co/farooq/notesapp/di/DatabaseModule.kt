package co.farooq.notesapp.di

import android.app.Application
import androidx.room.Room
import co.farooq.notesapp.feature_note.data.datasource.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

}