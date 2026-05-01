package com.example.praktam_2467051025.network

import com.example.praktam_2467051025.model.TagihanItem
import retrofit2.http.GET

interface ApiService {
    @GET("menu_tagihan.json")
    suspend fun getTagihan(): List<TagihanItem>
}