package com.agobikk.films.screens.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.agobikk.films.R
import com.agobikk.films.databinding.FragmentFavoriteBinding
import com.agobikk.films.databinding.FragmentMainBinding
import com.agobikk.films.screens.main.MainAdapter
import com.agobikk.films.screens.main.MainFragmentViewModel


class FavoriteFragment : Fragment(R.layout.fragment_favorite) {

    private val viewBinding: FragmentFavoriteBinding by viewBinding()
    private lateinit var recyclerView: RecyclerView
    private val adapter by lazy { FavoriteAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    private fun init()  {
        val viewModel = ViewModelProvider(this).get(FavoriteFragmentViewModel::class.java)
        recyclerView = viewBinding.rvFavorite




    }
}