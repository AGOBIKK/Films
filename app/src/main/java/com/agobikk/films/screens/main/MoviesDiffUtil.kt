package com.agobikk.films.screens.main

import androidx.recyclerview.widget.DiffUtil
import com.agobikk.films.models.MovieItemModel

class MoviesDiffUtil : DiffUtil.ItemCallback<MovieItemModel> () {

    override fun areItemsTheSame(oldItem: MovieItemModel, newItem: MovieItemModel) = oldItem === newItem

    override fun areContentsTheSame(oldItem: MovieItemModel, newItem: MovieItemModel) = oldItem == newItem


}