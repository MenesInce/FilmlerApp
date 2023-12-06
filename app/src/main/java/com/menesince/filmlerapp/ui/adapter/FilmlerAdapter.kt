package com.menesince.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.menesince.filmlerapp.data.entity.Filmler
import com.menesince.filmlerapp.databinding.CardTasarimBinding
import com.menesince.filmlerapp.ui.fragment.AnasayfaFragmentDirections

class FilmlerAdapter(var mContext: Context , var filmlerList: List<Filmler>) : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu (var tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerList.get(position)
        var t = holder.tasarim
        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.image.toString(),"drawable",mContext.packageName))

        t.textViewFiyat.text = "${film.fiyat} ₺"


        t.cardViewFilm.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it,"${film.ad} sepete eklendi",Snackbar.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount(): Int {
       return filmlerList.size
    }

}