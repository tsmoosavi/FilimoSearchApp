package com.example.filimosearchapp.ui.fragments.search_result

import android.media.Image
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
//        var image = getItem(position).pic.
//        val imageUrl = getItem(position).src
//        if (!imageUrl.isNullOrEmpty()) {
//            Glide.with(holder.binding.ivImage)
//                .load(imageUrl)
//                .placeholder(R.drawable.ic_baseline_center_focus_strong_24)
//                .into(holder.binding.ivImage)
//        }


    }
}

object MovieDiffCallback : DiffUtil.ItemCallback<Data>() {

    override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem.movieId == newItem.movieId
    }
}