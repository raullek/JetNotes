package com.example.jetnotes.presentation.notesdetail.view

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetnotes.presentation.notesdetail.models.NoteDetailViewState


@Composable
fun NoteDetailViewInitial(
    modifier: Modifier,
    navController: NavController,
    state: NoteDetailViewState.ViewStateIntitial,
    onTitleChanged: (String) -> Unit,
    onDescriptionChanged: (String) -> Unit
) {

    Surface(
        modifier = Modifier
            .background(Color.White)
            .fillMaxHeight()
    ) {
        Column(Modifier.fillMaxHeight()) {

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                singleLine = true,
                value = state.title,
                placeholder = { Text(text = "Название") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                    disabledTextColor = Color.Gray,
                    textColor = Color.Black,
                    placeholderColor = Color.Gray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black

                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,

                    ),
                onValueChange = onTitleChanged
            )

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = state.description,
                placeholder = { Text(text = "Название") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                    disabledTextColor = Color.Gray,
                    textColor = Color.Black,
                    placeholderColor = Color.Gray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black

                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,

                    ),
                onValueChange = {  }
            )

        }
    }

    @Composable
    fun HeaderTextField() {
        var text by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = text,
            placeholder = { Text(text = "Название") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                disabledTextColor = Color.Gray,
                textColor = Color.Black,
                placeholderColor = Color.Gray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Black

            ),
            textStyle = TextStyle(
                fontSize = 16.sp,

                ),
            onValueChange = { text = it }
        )
    }

    @Composable
    fun MainTextField() {
        var text by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            value = text,
            placeholder = { Text(text = "Текст") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                disabledTextColor = Color.Gray,
                textColor = Color.Black,
                placeholderColor = Color.Gray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Black

            ),
            textStyle = TextStyle(
                fontSize = 16.sp,

                ),
            onValueChange = { text = it }
        )
    }


}