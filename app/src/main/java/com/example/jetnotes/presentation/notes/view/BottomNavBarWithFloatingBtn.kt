package com.example.jetnotes.presentation.notes.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BottomNavigationBarWithFloatingButton(fabShape: RoundedCornerShape){
    BottomAppBar(
        backgroundColor = Color.Black,
        contentColor = Color.White,
        elevation = 10.dp,
        cutoutShape = fabShape

    ) {

        IconButton(
            onClick = {
                /* doSomething() */
            }
        ) {
            Icon(Icons.Filled.Face,"")
        }
        // The actions should be at the end of the BottomAppBar
        Spacer(Modifier.width(1.dp))
        IconButton(
            onClick = {
                /* doSomething() */
            }
        ) {
            Icon(Icons.Filled.Create,"")
        }

    }

}