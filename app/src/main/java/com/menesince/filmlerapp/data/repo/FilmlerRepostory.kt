package com.menesince.filmlerapp.data.repo

import com.menesince.filmlerapp.data.datasource.FilmlerDataSource
import com.menesince.filmlerapp.data.entity.Filmler

class FilmlerRepostory {

    var fds = FilmlerDataSource()

    suspend fun filmleriYukle() : List<Filmler> = fds.filmleriYukle()
}