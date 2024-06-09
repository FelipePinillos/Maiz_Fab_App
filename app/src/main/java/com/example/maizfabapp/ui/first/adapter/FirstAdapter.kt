package com.example.maizfabapp.ui.first.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.maizfabapp.R
import com.example.maizfabapp.domain.model.FirstInfo

class FirstAdapter(private var FirstList: List<FirstInfo> = emptyList(), private val onItemSelected:(FirstInfo)->Unit ) :
    RecyclerView.Adapter<FirstViewHolder>() {


    fun updateList(list: List<FirstInfo>){
        FirstList = list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_first,parent,false)
        )
    }

    override fun getItemCount() = FirstList.size

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.render( FirstList[position], onItemSelected  )
    }


}