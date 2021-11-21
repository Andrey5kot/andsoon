package com.kot.andsoon.mainpages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentMainPageBinding
import com.kot.andsoon.mainpages.buttonNavPages.HomeFragment
import com.kot.andsoon.mainpages.buttonNavPages.ProfileFragment
import com.kot.andsoon.mainpages.buttonNavPages.StatisticsFragment
import kotlin.concurrent.fixedRateTimer

class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    private val homeFragment= HomeFragment()
    private val profileFragment= ProfileFragment()
    private val statisticsFragment= StatisticsFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)


        // Inflate the layout for this fragment
        binding.navView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.navigation_home -> replaceFragment(homeFragment)
                R.id.navigation_profile -> replaceFragment(profileFragment)
                R.id.navigation_statistics -> replaceFragment(statisticsFragment)
            }
            true
        }

        replaceFragment(profileFragment)

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