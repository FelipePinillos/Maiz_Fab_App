package com.example.maizfabapp.domain.model

import com.example.maizfabapp.R

sealed class FirstInfo(val img:Int, val name:Int){
    data object Aries:FirstInfo(R.drawable.aries, R.string.aries)
    data object Taurus: FirstInfo(R.drawable.tauro, R.string.taurus)
    data object Gemini: FirstInfo(R.drawable.geminis, R.string.gemini)
    data object Cancer: FirstInfo(R.drawable.cancer, R.string.cancer)
    data object Leo: FirstInfo(R.drawable.leo, R.string.leo)
    data object Virgo: FirstInfo(R.drawable.virgo, R.string.virgo)
    data object Libra: FirstInfo(R.drawable.libra, R.string.libra)
    data object Scorpio: FirstInfo(R.drawable.escorpio, R.string.scorpio)
    data object Sagittarius: FirstInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Capricorn: FirstInfo(R.drawable.capricornio, R.string.capricorn)
    data object Aquarius: FirstInfo(R.drawable.aquario, R.string.aquarius)
    data object Pisces: FirstInfo(R.drawable.piscis, R.string.pisces)

}
