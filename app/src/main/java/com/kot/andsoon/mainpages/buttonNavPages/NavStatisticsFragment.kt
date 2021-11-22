package com.kot.andsoon.mainpages.buttonNavPages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentStatisticsBinding


class NavStatisticsFragment : Fragment() {
    private lateinit var binding: FragmentStatisticsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatisticsBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root

    }
}