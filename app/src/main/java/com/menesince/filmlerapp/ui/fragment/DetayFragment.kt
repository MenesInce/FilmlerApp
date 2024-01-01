package com.menesince.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.menesince.filmlerapp.R
import com.menesince.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay ,container, false)



       val bundle : DetayFragmentArgs by navArgs()

       val gelenFilm = bundle.film
       binding.filmNesnesi = gelenFilm



     binding.detayToolbarBaslik = gelenFilm.ad

     binding.ivFilm.setImageResource(this.resources.getIdentifier(gelenFilm.image.toString(),"drawable",requireContext().packageName))



        return binding.root

    }
}