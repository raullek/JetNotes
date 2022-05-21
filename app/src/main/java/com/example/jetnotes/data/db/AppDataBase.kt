package com.example.jetnotes.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jetnotes.data.db.dao.NotesDao
import com.example.jetnotes.data.model.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun notesDao(): NotesDao
}