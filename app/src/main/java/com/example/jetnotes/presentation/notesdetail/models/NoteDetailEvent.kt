package com.example.jetnotes.presentation.notesdetail.models

sealed class NoteDetailEvent {
    data class TitleChanged(val newValue: String) : NoteDetailEvent()
    data class DescriptionChanged(val newValue: String) : NoteDetailEvent()
}
