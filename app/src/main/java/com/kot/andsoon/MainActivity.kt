package com.kot.andsoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.kot.andsoon.mainpages.buttonNavPages.HomeFragment
import com.kot.andsoon.mainpages.buttonNavPages.ProfileFragment
import com.kot.andsoon.mainpages.buttonNavPages.StatisticsFragment

class MainActivity : AppCompatActivity() {
    private val homeFragment= HomeFragment()
    private val profileFragment= ProfileFragment()
    private val StatisticsFragment= StatisticsFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
