package com.example.days_18.dao

import androidx.room.*
import com.example.days_18.models.Note

@Dao
interface NoteDao {




    @Insert
    fun insertNote(note : Note) : Long

    @Delete
    fun DeleteNote(note : Note)
    @Update
    fun updateNote(note : Note)

    @Query("select * from note")
    fun getAll() : List<Note>

    @Query("select * from note where nid =:nid")
    fun findById(nid : Int) : Note

    @Query("select * from note where title like :title ")
    fun searchTitle(title:String) : List<Note>
}