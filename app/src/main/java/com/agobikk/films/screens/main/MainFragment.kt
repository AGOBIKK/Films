package com.agobikk.films.screens.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.agobikk.films.R
import com.agobikk.films.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewBinding: FragmentMainBinding by viewBinding()
    private lateinit var recyclerView: RecyclerView
    private val adapter by lazy { MainAdapter() }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }



    private fun init()  {
        val viewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
        viewModel.getMovies()
        recyclerView = viewBinding.rvMain
        recyclerView.adapter = adapter
        viewModel.mMovies.observe(viewLifecycleOwner) { list ->
            adapter.setList(list.body()!!.movieItemModels)


        }


    }
}