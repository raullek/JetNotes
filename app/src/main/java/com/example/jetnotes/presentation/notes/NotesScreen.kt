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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetnotes.presentation.notes.view.BottomNavigationBarWithFloatingButton
import com.example.jetnotes.presentation.notes.view.NotesItemView


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NotesScreen() {
    val list = (1..20).map { it.toString() }
    Scaffold(
        modifier = Modifier
            .background(Color.White)
            .fillMaxHeight(),
        bottomBar = { BottomNavigationBarWithFloatingButton(fabShape = RoundedCornerShape(50)) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
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
                items(list.size) { index ->
                    NotesItemView()
                }
            }
        )

    }
}

@Preview
@Composable
fun DefaultPreview() {
    NotesScreen()
}