package com.appchef.medium_clone.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.appchef.medium_clone.databinding.FragmentFeedBinding

class GlobalFeedFragment: Fragment() {

    private var _binding : FragmentFeedBinding? = null
    private lateinit var viewModel: FeedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentFeedBinding.inflate(inflater,container,false)

        viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)

        // binding.root returns the view
        return _binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}