package com.menesince.filmlerapp.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.data.entity.Filmler
import com.menesince.filmlerapp.databinding.FragmentAnasayfaBinding
import com.menesince.filmlerapp.ui.adapter.FilmlerAdapter
import com.menesince.filmlerapp.ui.viewmodel.AnasayfaViewModel

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
 @SuppressLint("SuspiciousIndentation")
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa ,container, false)

     binding.anasayfaToolbarBaslik= "Filmler"

     viewModel.filmListesi.observe(viewLifecycleOwner){
         val filmlerAdapter = FilmlerAdapter(requireContext(), it)
         binding.filmlerAdapter= filmlerAdapter
     }

        return binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }
}