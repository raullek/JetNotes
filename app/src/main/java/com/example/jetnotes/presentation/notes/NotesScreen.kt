package com.example.jetnotes.presentation.notes

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetnotes.presentation.NotesScreens
import com.example.jetnotes.presentation.notes.state.NoteListViewState
import com.example.jetnotes.presentation.notes.view.BottomNavigationBarWithFloatingButton
import com.example.jetnotes.presentation.notes.view.NotesInitialView
import com.example.jetnotes.presentation.notes.view.NotesItemView


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NotesScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    notesScreenViewModel: NotesScreenViewModel
) {
    val viewState = notesScreenViewModel.dailyViewState.collectAsState()
    when (val state = viewState.value) {
        is NoteListViewState.Display -> NotesInitialView(
            modifier = modifier,
            navController = navController,
            state = state
        )
        is NoteListViewState.Error ->{}
        is NoteListViewState.Loading ->{}
        is NoteListViewState.NoItems ->{}
    }

}

@Preview
@Composable
fun DefaultPreview() {
    // NotesScreen()
}