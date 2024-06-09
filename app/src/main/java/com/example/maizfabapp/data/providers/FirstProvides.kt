package com.example.maizfabapp.data.providers

import com.example.maizfabapp.domain.model.FirstInfo
import com.example.maizfabapp.domain.model.FirstInfo.*
import javax.inject.Inject

class FirstProvides @Inject constructor(){

    fun getFirst(): List<FirstInfo> {
        return listOf(
            Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio,
            Sagittarius, Capricorn, Aquarius, Pisces

        )
    }
}