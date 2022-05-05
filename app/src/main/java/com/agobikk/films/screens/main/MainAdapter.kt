package com.agobikk.films.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agobikk.films.R
import com.agobikk.films.databinding.ItemLayoutBinding
import by.kirich1409.viewbindingdelegate.viewBinding
import com.agobikk.films.models.MovieItemModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/***
 * Вариант простого адаптера (оставил для обучения)  данный адаптер заменил на ListAdapter
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {
    private var listMovies = emptyList<MovieItemModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }


    override fun getItemCount(): Int = listMovies.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
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

    fun setList(list: List<MovieItemModel>) {
        listMovies = list
        notifyDataSetChanged()
    }


}