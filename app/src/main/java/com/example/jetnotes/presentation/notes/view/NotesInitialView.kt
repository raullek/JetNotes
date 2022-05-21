package com.example.jetnotes.presentation.notes.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetnotes.presentation.notes.state.NoteListViewState
import com.example.jetnotes.presentation.notesdetail.models.NoteDetailViewState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NotesInitialView(
    modifier: Modifier,
    navController: NavController,
    state: NoteListViewState.Display
) {

    Scaffold(
        modifier = Modifier
            .background(Color.White)
            .fillMaxHeight(),
        bottomBar = { BottomNavigationBarWithFloatingButton(fabShape = RoundedCornerShape(50)) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate("notesDetail") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier.also { it.width(50.dp) }
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.End

    ) {
        LazyVerticalGrid(
            modifier = Modifier
                .background(Color.White)
                .padding(it)
                .fillMaxHeight(),
            cells = GridCells.Fixed(2),
            content = {

                items(state.items.size) { index ->
                    NotesItemView(note = state.items[index])
                }
            }
        )

    }

}