package com.menesince.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     binding = FragmentDetayBinding.inflate(inflater, container, false)



       val bundle : DetayFragmentArgs by navArgs()

       val gelenFilm = bundle.film



     binding.toolbarDetay.title = gelenFilm.ad

     binding.ivFilm.setImageResource(this.resources.getIdentifier(gelenFilm.image.toString(),"drawable",requireContext().packageName))
     binding.tvFiyat.text = "${gelenFilm.fiyat} ₺"


        return binding.root

    }
}