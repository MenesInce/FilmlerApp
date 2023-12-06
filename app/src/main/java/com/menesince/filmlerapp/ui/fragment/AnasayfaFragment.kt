package com.menesince.filmlerapp.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.data.entity.Filmler
import com.menesince.filmlerapp.databinding.FragmentAnasayfaBinding
import com.menesince.filmlerapp.ui.adapter.FilmlerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
 @SuppressLint("SuspiciousIndentation")
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

     binding.toolbarAnasayfa.title = "Filmler"
     binding.filmRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


     val list = ArrayList<Filmler>()
     val django = Filmler(1,"Django",R.drawable.django,24)
     val anadoluda = Filmler(2,"Bir Zamanlar Anadoluda",R.drawable.anadoluda,28)
     val inception = Filmler(3,"İnception",R.drawable.inception,35)
     val intersteller = Filmler(4,"İntersteller",R.drawable.interstellar,40)
     val theHatefullEight = Filmler(5,"The Hatefull Eight",R.drawable.thehatefulleight,20)
     val thePianist = Filmler(6,"The Pianist",R.drawable.thepianist,38)

     list.add(django)
     list.add(anadoluda)
     list.add(inception)
     list.add(intersteller)
     list.add(theHatefullEight)
     list.add(thePianist)


     val filmlerAdapter = FilmlerAdapter(requireContext(), list)
     binding.filmRv.adapter = filmlerAdapter


        return binding.root

    }
}