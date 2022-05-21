package com.example.jetnotes.presentation.notes.state

import com.example.jetnotes.domain.model.Note

sealed class NoteListViewState {
    object Error : NoteListViewState()
    object NoItems : NoteListViewState()
    object Loading : NoteListViewState()

    data class Display(
        val items: List<Note>
    ) : NoteListViewState()
}