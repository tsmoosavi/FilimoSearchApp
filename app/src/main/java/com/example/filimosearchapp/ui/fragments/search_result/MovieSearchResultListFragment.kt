package com.example.filimosearchapp.ui.fragments.search_result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.filimosearchapp.databinding.FragmentMovieSearchResultListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieSearchResultListFragment : Fragment() {

    private var _binding: FragmentMovieSearchResultListBinding? = null
    private val args: MovieSearchResultListFragmentArgs by navArgs()
    private val vm: SearchResultViewModel by viewModels()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMovieSearchResultListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "results"
        val adapter = SearchResultAdapter()
        binding.movieRecycler.adapter = adapter
        vm.getMovieList(args.searchWord)
        vm.movieList.observe(viewLifecycleOwner){
            adapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}