package com.example.jetnotes.presentation.notesdetail.models

import com.example.jetnotes.domain.model.Note

sealed class NoteDetailViewState {
    data class ViewStateIntitial(
        val note: Note
    ) : NoteDetailViewState()

    object Loading : NoteDetailViewState()
}