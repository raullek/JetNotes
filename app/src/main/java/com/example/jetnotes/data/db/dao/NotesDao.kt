package com.example.jetnotes.data.db.dao

import androidx.room.*
import com.example.jetnotes.data.model.entity.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesDao {

    @Insert
    suspend fun insertNote(users: NoteEntity)

    @Query("Select * from note")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Query("Select * from note where :id is userId ")
    fun getNoteById(id: Int): Flow<List<NoteEntity>>

    @Update
    suspend fun updateNote(users: NoteEntity)

    @Delete
    suspend fun deleteNote(users: NoteEntity)
}