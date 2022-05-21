package com.example.jetnotes.presentation.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetnotes.base.EventHandler
import com.example.jetnotes.domain.repository.NotesRepository
import com.example.jetnotes.presentation.notes.state.NoteListEvent
import com.example.jetnotes.presentation.notes.state.NoteListViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesScreenViewModel @Inject constructor(private val notesRepository: NotesRepository) :
    ViewModel(), EventHandler<NoteListEvent> {

    private val _dailyViewState: MutableStateFlow<NoteListViewState> =
        MutableStateFlow(NoteListViewState.Loading)
    val dailyViewState: StateFlow<NoteListViewState> = _dailyViewState


    override fun obtainEvent(event: NoteListEvent) {
        when (event) {
            NoteListEvent.EnterScreen -> {
                getAllNotes()
            }
            NoteListEvent.AddNoteEvent -> {
            }
        }
    }

    private fun getAllNotes() {
        viewModelScope.launch {
            notesRepository
                .getAllNotes()
                .collect {
                    _dailyViewState.value = NoteListViewState.Display(it)
                }

        }
    }


}