package com.kot.andsoon.mainpages.mainpage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.kot.andsoon.R
import com.kot.andsoon.databinding.FragmentMainPageBinding
import com.kot.andsoon.databinding.FragmentMainSignBinding
import com.kot.andsoon.mainpages.mainpage.slider.IntroSlide
import com.kot.andsoon.mainpages.mainpage.slider.IntroSliderAdapter

class MainPageFragment : Fragment() {

    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        binding.introSliderViewPager2.adapter = introSliderAdapter

        //calling function
        setupIndicators()
        setCurrentIndicator(0)
        binding.introSliderViewPager2.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        binding.btnNext.setOnClickListener{view:View->
            if (binding.introSliderViewPager2.currentItem +1 < introSliderAdapter.itemCount) {
                binding.introSliderViewPager2.currentItem +=1
            }else{

                    view.findNavController().navigate(R.id.navPageFragment)

            }
            }

        binding.skipTextView.setOnClickListener{
                view:View->
            view.findNavController().navigate(R.id.navPageFragment)
            }
        return binding.root
    }

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlide(
                "Analyze Your Meal!",
                "Analyze your meal in simple way with our meal analyzer",
                R.drawable.analyze_meal
            ),
            IntroSlide(
                "Find Recipes!",
                "Find new and interesting recipes out of 2.3+ million nutritionally analyzed recipes",
                R.drawable.view_recipes
            ),
            IntroSlide(
                "Check your statistics!",
                "Check your own statistics of food",
                R.drawable.check_stat
            )
        )
    )

    private fun setCurrentIndicator(index: Int) {
        val childCount = binding.indicatorsContainer.childCount
        for (i in 0 until childCount) {
            val imageView2 = binding.indicatorsContainer[i] as ImageView
            if (i == index) {
                imageView2.setImageDrawable(
                    activity?.applicationContext?.let {
                        ContextCompat.getDrawable(
                            it,
                            R.drawable.indicator_active
                        )
                    }
                )
            } else {
                imageView2.setImageDrawable(
                    activity?.applicationContext?.let {
                        ContextCompat.getDrawable(
                            it,
                            R.drawable.indicator_inactive
                        )
                    }
                )
            }
        }
    }

    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(activity?.applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    activity?.applicationContext?.let {
                        ContextCompat.getDrawable(
                            it,
                            R.drawable.indicator_inactive
                        )
                    }
                )
                this?.layoutParams = layoutParams
            }
            binding.indicatorsContainer.addView(indicators[i])
        }
    }
}

