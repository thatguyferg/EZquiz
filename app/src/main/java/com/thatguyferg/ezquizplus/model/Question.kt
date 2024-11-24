package com.thatguyferg.ezquizplus.model

data class Question(
    val prompt: String,
    val answer: Int,
    val options: List<String>
)