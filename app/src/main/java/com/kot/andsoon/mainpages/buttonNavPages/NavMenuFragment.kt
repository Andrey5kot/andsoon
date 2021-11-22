package com.kot.andsoon.mainpages.buttonNavPages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentNavPageBinding
import com.kot.andsoon.mainpages.buttonNavPages.NavHomeFragment
import com.kot.andsoon.mainpages.buttonNavPages.NavProfileFragment
import com.kot.andsoon.mainpages.buttonNavPages.NavStatisticsFragment

class NavMenuFragment : Fragment() {
    private lateinit var binding: FragmentNavPageBinding
    private val homeFragment= NavHomeFragment()
    private val profileFragment= NavProfileFragment()
    private val statisticsFragment= NavStatisticsFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNavPageBinding.inflate(inflater, container, false)


        // Inflate the layout for this fragment
        binding.navView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.navigation_home -> replaceFragment(homeFragment)
                R.id.navigation_profile -> replaceFragment(profileFragment)
                R.id.navigation_statistics -> replaceFragment(statisticsFragment)
            }
            true
        }

        replaceFragment(homeFragment)

        return binding.root

    }
    private fun replaceFragment(fragment: Fragment){
        if(fragment!=null){
            val transaction:FragmentTransaction= requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }
}