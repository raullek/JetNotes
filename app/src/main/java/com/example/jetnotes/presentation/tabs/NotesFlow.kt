package com.example.jetnotes.presentation.tabs

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetnotes.presentation.NotesScreens
import com.example.jetnotes.presentation.notes.NotesScreen
import com.example.jetnotes.presentation.notes.NotesScreenViewModel
import com.example.jetnotes.presentation.notesdetail.NotesDetailScreen
import com.example.jetnotes.presentation.notesdetail.NotesDetailViewModel

fun NavGraphBuilder.notesFlow(
    navController: NavController
) {
    navigation(startDestination = "notes", route = NotesScreens.Notes.route){
        composable("notes") {
            val notesScreenViewModel = hiltViewModel<NotesScreenViewModel>()
            NotesScreen(
                navController = navController,
                notesScreenViewModel = notesScreenViewModel
            )
        }

        composable("notesDetail") {
            val notesScreenViewModel = hiltViewModel<NotesDetailViewModel>()
            NotesDetailScreen(
                navController = navController,
                notesScreenViewModel
            )
        }

    }
}