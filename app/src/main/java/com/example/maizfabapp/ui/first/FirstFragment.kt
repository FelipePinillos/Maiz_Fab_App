package com.example.maizfabapp.ui.first

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.maizfabapp.databinding.FragmentFirstBinding
import com.example.maizfabapp.ui.first.adapter.FirstAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class FirstFragment : Fragment() {

    private val FirstViewModel by viewModels<FirstViewModel>()
    private lateinit var firstAdapter: FirstAdapter

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initUIState()
        initList()
    }

    private fun initList() {
        firstAdapter = FirstAdapter(onItemSelected = {Toast.makeText(context,getString(it.name),Toast.LENGTH_LONG).show()})


        binding.rvFirst.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = firstAdapter

        }




    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                FirstViewModel.first.collect() {

                    //CAMBIOS EN FIRST
                    firstAdapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}