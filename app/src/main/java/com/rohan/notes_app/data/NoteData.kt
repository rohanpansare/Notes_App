package com.rohan.notes_app.data

import com.rohan.notes_app.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "JetPack Compose", description = "This is Compose"),
            Note(title = "JetPack Navigation", description = "This is Navigation"),
            Note(title = "Room", description = "This is Room library")
        )
    }
}