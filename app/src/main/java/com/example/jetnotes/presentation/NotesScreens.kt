package com.example.jetnotes.presentation

sealed class NotesScreens(val route: String) {
    object Notes : NotesScreens("notesFlow")
}