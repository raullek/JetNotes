package com.example.jetnotes.presentation.notesdetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NotesDetailScreen() {

    Scaffold(
        modifier = Modifier
            .background(Color.White)
            .fillMaxHeight()
    ) {
        Column(Modifier.fillMaxHeight()) {
            HeaderTextField()
            MainTextField()

        }
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
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent

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
            .fillMaxHeight()
        ,
        value = text,
        placeholder = { Text(text = "Текст") },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            disabledTextColor = Color.Gray,

        ),
        textStyle = TextStyle(
            fontSize = 16.sp,

            ),
        onValueChange = { text = it }
    )
}


@Preview
@Composable
fun DefaultPreview() {
    NotesDetailScreen()
}