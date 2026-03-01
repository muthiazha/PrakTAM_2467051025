package com.example.praktam_2467051025.model

import androidx.annotation.DrawableRes

data class TagihanItem(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)