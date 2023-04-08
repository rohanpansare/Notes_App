package com.rohan.notes_app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rohan.notes_app.model.Note
import com.rohan.notes_app.util.DateConverter

@Database(entities = [Note::class], version = 3, exportSchema = false)
@TypeConverters(DateConverter:: class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDataBaseDao
}