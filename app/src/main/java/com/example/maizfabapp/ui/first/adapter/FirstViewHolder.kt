package com.example.maizfabapp.ui.first.adapter

import android.content.Context
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.maizfabapp.databinding.ItemFirstBinding
import com.example.maizfabapp.domain.model.FirstInfo

class FirstViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemFirstBinding.bind(view)

    fun render(firstInfo: FirstInfo, onItemSelected: (FirstInfo) -> Unit){

        val context:Context  =binding.tvTitle.context

        binding.ivFirst.setImageResource(firstInfo.img)
        binding.tvTitle.text = context.getString(firstInfo.name)

        binding.parent.setOnClickListener{
            startRotationAnimation(binding.ivFirst)
            onItemSelected(firstInfo)
        }

    }

    private fun  startRotationAnimation(view: View){
        view.animate().apply{
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            start()
        }

    }


}