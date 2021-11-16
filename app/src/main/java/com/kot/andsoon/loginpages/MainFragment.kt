package com.kot.andsoon.loginpages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.signInMainButton.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.signInFragment)
        }
        binding.signUpMainButton.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.signUpFragment)
        }
        // Inflate the layout for this fragment
        return binding.root

    }
}