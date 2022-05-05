package com.agobikk.films.screens.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.agobikk.films.R
import com.agobikk.films.databinding.FragmentDetailBinding
import com.agobikk.films.databinding.FragmentFavoriteBinding
import com.agobikk.films.screens.favorite.FavoriteAdapter
import com.agobikk.films.screens.favorite.FavoriteFragmentViewModel

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val viewBinding: FragmentDetailBinding by viewBinding()




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }



    private fun init()  {
        val viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
    }
}
