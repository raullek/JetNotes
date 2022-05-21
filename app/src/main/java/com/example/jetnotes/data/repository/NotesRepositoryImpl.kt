package com.example.jetnotes.data.repository

import com.example.jetnotes.data.db.dao.NotesDao
import com.example.jetnotes.data.model.entity.toNote
import com.example.jetnotes.domain.model.Note
import com.example.jetnotes.domain.model.toEntity
import com.example.jetnotes.domain.repository.NotesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapLatest

class NotesRepositoryImpl(private val notesDao: NotesDao) : NotesRepository {

    override fun getAllNotes(): Flow<List<Note>> {
        return notesDao.getAllNotes().map {
            it.map { it.toNote() }
        }
    }

    override fun getNote(noteId: Int): Flow<Note> {
        return notesDao.getNoteById(noteId).map { noteList ->
            noteList.first().toNote()
        }
    }

    override suspend fun insertNote(note: Note) {
        notesDao.insertNote(note.toEntity())
    }
}