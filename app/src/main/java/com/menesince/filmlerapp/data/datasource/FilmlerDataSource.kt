package com.menesince.filmlerapp.data.datasource

import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {

    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO) {
            val list = ArrayList<Filmler>()
            val django = Filmler(1,"Django", R.drawable.django,24)
            val anadoluda = Filmler(2,"Bir Zamanlar Anadoluda", R.drawable.anadoluda,28)
            val inception = Filmler(3,"İnception", R.drawable.inception,35)
            val intersteller = Filmler(4,"İntersteller", R.drawable.interstellar,40)
            val theHatefullEight = Filmler(5,"The Hatefull Eight", R.drawable.thehatefulleight,20)
            val thePianist = Filmler(6,"The Pianist", R.drawable.thepianist,38)

            list.add(django)
            list.add(anadoluda)
            list.add(inception)
            list.add(intersteller)
            list.add(theHatefullEight)
            list.add(thePianist)

            return@withContext list
        }
}