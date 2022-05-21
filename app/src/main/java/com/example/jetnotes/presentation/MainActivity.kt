package com.example.jetnotes.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.jetnotes.presentation.notes.NotesScreen
import com.example.jetnotes.presentation.tabs.notesFlow
import com.example.jetnotes.ui.theme.JetNotesTheme
import com.example.jetnotes.ui.theme.Purple200
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkModeValue = true

            val isDarkMode = remember { mutableStateOf(isDarkModeValue) }

            JetNotesTheme(darkTheme = isDarkMode.value) {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()

//                SideEffect {
//                    systemUiController.setSystemBarsColor(
//                        color = if (isDarkMode.value) Purple200 else baseLightPalette.primaryBackground,
//                        darkIcons = !isDarkMode.value
//                    )
//                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = NotesScreens.Notes.route
                    ) {
                        notesFlow(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetNotesTheme {
        Greeting("Android")
    }
}