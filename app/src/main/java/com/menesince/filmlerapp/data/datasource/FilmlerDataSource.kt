package com.menesince.filmlerapp.data.datasource

import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.data.entity.Filmler
import com.menesince.filmlerapp.room.IFilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var fDao: IFilmlerDao) {

    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO) {

            return@withContext fDao.filmleriListele()
        }
}