package com.agobikk.films.screens.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.agobikk.films.R
import com.agobikk.films.databinding.FragmentMainBinding
import com.agobikk.films.models.MovieItemModel

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewBinding: FragmentMainBinding by viewBinding()
    private lateinit var adapter: MoviesListAdapter
    private val viewModel: MainFragmentViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }


    private fun init() = with(viewBinding) {
        viewModel.getMovies()
        adapter = MoviesListAdapter(object : OnClickListener {
            override fun onClick(listMovies: MovieItemModel) {
                navigateToRecipeList()
            }
        })
        rvMain.adapter = adapter
        viewModel.mMovies.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list.body()!!.results)
        }
    }

    private fun navigateToRecipeList() {
        findNavController().navigate(R.id.action_mainFragment_to_detailFragment)

    }
}