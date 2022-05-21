package com.example.jetnotes.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.jetnotes.domain.model.Note

@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    var userId: Int? = null,
    val noteTitle: String?,
    var noteBody: String?,
    val createdDateInMillis: Long
)

fun NoteEntity.toNote(): Note =
    Note(this.userId, this.noteTitle, this.noteBody, this.createdDateInMillis)
