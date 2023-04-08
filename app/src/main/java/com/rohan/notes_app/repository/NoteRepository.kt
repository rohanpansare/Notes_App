package com.rohan.notes_app.repository

import com.rohan.notes_app.data.NoteDataBaseDao
import com.rohan.notes_app.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDataBaseDao: NoteDataBaseDao){

    suspend fun addNote(note: Note) = noteDataBaseDao.insert(note)

    suspend fun updateNote(note: Note) = noteDataBaseDao.update(note)

    suspend fun deleteNote(note: Note) = noteDataBaseDao.deleteNote(note)

    suspend fun deleteAllNotes() = noteDataBaseDao.deleteAll()

    suspend fun getAllNotes(): Flow<List<Note>> = noteDataBaseDao.getNotes().flowOn(Dispatchers.IO).conflate()
}