package com.agobikk.films.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.agobikk.films.R
import com.agobikk.films.models.MovieItemModel
import com.agobikk.films.databinding.ItemLayoutBinding
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MoviesListAdapter(private val onClickListener: OnClickListener) :
    ListAdapter<MovieItemModel, MoviesListAdapter.MoviesViewHolder>(MoviesDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder =
        MoviesViewHolder (
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
                )


    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val item = getItem(position)
        holder.itemView.setOnClickListener { onClickListener.onClick(item) }
        holder.bind(item)
    }

    class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val viewBinding: ItemLayoutBinding by viewBinding()
        fun bind(listMovies: MovieItemModel) = with(viewBinding) {
            itemTitle.text = listMovies.title
            itemDate.text = listMovies.release_date
            itemImg.apply {
                Glide
                    .with(context)
                    .setDefaultRequestOptions(
                        RequestOptions()
                            .placeholder(R.drawable.loading_animation)
                            .error(R.drawable.ic_broken_image)
                    )
                    .load(listMovies.poster_path)
                    .centerCrop()
                    .into(this)
            }
        }
    }
}



















