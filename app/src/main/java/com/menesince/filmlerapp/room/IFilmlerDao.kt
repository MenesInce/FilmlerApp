package com.menesince.filmlerapp.room

import androidx.room.Dao
import androidx.room.Query
import com.menesince.filmlerapp.data.entity.Filmler

@Dao
interface IFilmlerDao {
    @Query("SELECT * FROM filmler")
    suspend fun filmleriListele() : List<Filmler>
}