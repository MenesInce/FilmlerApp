package com.menesince.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menesince.filmlerapp.data.entity.Filmler
import com.menesince.filmlerapp.data.repo.FilmlerRepostory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {
    var fRepo = FilmlerRepostory()
    var filmListesi = MutableLiveData<List<Filmler>>()

    init {
        filmleriYukle()
    }

    fun filmleriYukle() {
        CoroutineScope(Dispatchers.Main).launch {
            filmListesi.value = fRepo.filmleriYukle()
        }
    }
}