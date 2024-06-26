package com.example.maizfabapp.ui.third

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.maizfabapp.R
import com.example.maizfabapp.databinding.FragmentFirstBinding
import com.example.maizfabapp.databinding.FragmentThirdBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}