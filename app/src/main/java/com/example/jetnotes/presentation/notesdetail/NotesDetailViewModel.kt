package com.example.jetnotes.presentation.notesdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetnotes.domain.model.Note
import com.example.jetnotes.domain.repository.NotesRepository
import com.example.jetnotes.presentation.notes.state.NoteListViewState
import com.example.jetnotes.presentation.notesdetail.models.NoteDetailViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesDetailViewModel @Inject constructor(
    private val notesRepository: NotesRepository
) : ViewModel() {
    private val _noteDetailViewState: MutableStateFlow<NoteDetailViewState> =
        MutableStateFlow(NoteDetailViewState.Loading)
    val dailyViewState: StateFlow<NoteDetailViewState> = _noteDetailViewState


    fun saveNote(note: Note) {
        viewModelScope.launch {
            try {
                notesRepository.insertNote(note = note)
            } catch (e: Exception) {

            }
        }

    }

    fun getNote(id: Int?) {
        viewModelScope.launch {
            notesRepository.getNote(id!!).collect {
                _noteDetailViewState.value = NoteDetailViewState.ViewStateIntitial(it)
            }

        }

    }

}