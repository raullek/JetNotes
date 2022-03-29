package com.example.jetnotes.data.model

import java.util.*

data class Note(
    val id: Int = -1,
    val noteTitle: String,
    val noteBody: String,
    val createdDate: Date
)
