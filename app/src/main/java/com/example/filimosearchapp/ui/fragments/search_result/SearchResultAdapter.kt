package com.example.filimosearchapp.ui.fragments.search_result

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filimosearchapp.R
import com.example.filimosearchapp.databinding.MovieDetailItemBinding
import com.example.filimosearchapp.model.Data

class SearchResultAdapter() :
    ListAdapter<Data, SearchResultAdapter.ItemHolder>(MovieDiffCallback) {

    class ItemHolder(val binding: MovieDetailItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding: MovieDetailItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_detail_item,
            parent, false
        )
        return ItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.binding.movieName.text = getItem(position).movieTitle
        val imageUrl = getItem(position).pic.movieImgS
        if (!imageUrl.isNullOrEmpty()) {
            Glide.with(holder.binding.poster)
                .load(imageUrl)
                .placeholder(R.drawable.loading)
                .into(holder.binding.poster)
        }


    }
}

object MovieDiffCallback : DiffUtil.ItemCallback<Data>() {

    override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem.movieTitle == newItem.movieTitle
    }
}