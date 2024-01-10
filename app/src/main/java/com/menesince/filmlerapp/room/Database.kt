package com.menesince.filmlerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.menesince.filmlerapp.data.entity.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Database : RoomDatabase(){
    abstract fun getFilmlerDao(): IFilmlerDao

}