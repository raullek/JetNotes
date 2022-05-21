package com.example.jetnotes.domain.model

import com.example.jetnotes.data.model.entity.NoteEntity
import java.util.*

data class Note(
    val id: Int?,
    val noteTitle: String?,
    val noteBody: String?,
    val createdDateinMillis: Long
)

fun Note.toEntity(): NoteEntity =
    NoteEntity(this.id, this.noteTitle, this.noteBody, this.createdDateinMillis)
