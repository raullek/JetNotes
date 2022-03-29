package com.example.jetnotes.presentation.notes.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NotesItemView() {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(PaddingValues(horizontal = 8.dp, vertical = 8.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(16))
            .fillMaxWidth(),
        elevation = 0.dp
    ) {
        Text(
            text = "Hello",
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp,
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(16.dp)
        )
    }


}

@Preview
@Composable
fun DefaultPreview() {
    NotesItemView()
}