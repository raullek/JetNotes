package com.example.jetnotes.presentation.notes.state

sealed class NoteListEvent {
    object AddNoteEvent : NoteListEvent()
    object EnterScreen  : NoteListEvent()
}