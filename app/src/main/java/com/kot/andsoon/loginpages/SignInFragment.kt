package com.kot.andsoon.loginpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        binding.signUpTextbutton.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.signUpFragment)
        }

        // Inflate the layout for this fragment
        return binding.root

    }
}