package com.example.jetnotes.domain.repository

import com.example.jetnotes.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {

    fun getAllNotes(): Flow<List<Note>>

    fun getNote(noteId:Int):Flow<Note>

    suspend fun insertNote(note: Note)

}