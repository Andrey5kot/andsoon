package com.kot.andsoon.loginpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kot.andsoon.R

import com.kot.andsoon.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        binding.signInTextbutton.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.signInFragment)
        }

        // Inflate the layout for this fragment
        return binding.root

    }
}