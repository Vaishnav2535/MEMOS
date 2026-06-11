package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "Class", description = "I have a class at 4pm"),
            Note(title = "Game", description = "Let's play Uncharted on the ps4 at 8pm"),
            Note(title = "Sports", description = "I will play Basketball tomorrow"),
            Note(title = "Food", description = "I will be making a sandwich"),
            Note(title = "Friends", description = "I will be hanging out with my friends at the mall, tomorrow at 5pm"),
            Note(title = "Movies", description = "I will be watching Peddi and Supergirl this month"),
            Note(title = "Shopping", description = "I will go shopping for some necessities"),
            )
    }
}