package com.example.maizfabapp.ui.first


import androidx.lifecycle.ViewModel
import com.example.maizfabapp.data.providers.FirstProvides
import com.example.maizfabapp.domain.model.FirstInfo
import com.example.maizfabapp.domain.model.FirstInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class FirstViewModel @Inject constructor(firstProvides: FirstProvides) : ViewModel() {

    private var _first = MutableStateFlow<List<FirstInfo>>(emptyList())

    val first: StateFlow<List<FirstInfo>> = _first

    init {
        _first.value = firstProvides.getFirst()
    }


}