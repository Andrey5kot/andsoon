package com.kot.andsoon.mainpages.mainpage.slider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kot.andsoon.R
import com.kot.andsoon.databinding.SlideContainerBinding

class IntroSliderAdapter(private val introSlides: List<IntroSlide>):
    RecyclerView.Adapter<IntroSliderAdapter.IntoSlideViewHolder>(){

    inner class IntoSlideViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = SlideContainerBinding.bind(view)

        var textTitle = binding.textTitle
        var textDesc = binding.textDescription
        var imageIcon = binding.imgSlideIcon

        fun bind(introSlide: IntroSlide){
            textTitle.text = introSlide.title
            textDesc.text = introSlide.description
            imageIcon.setImageResource(introSlide.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntoSlideViewHolder {
        return IntoSlideViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_container,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntoSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }


}