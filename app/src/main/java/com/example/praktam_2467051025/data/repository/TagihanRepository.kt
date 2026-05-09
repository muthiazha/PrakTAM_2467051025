package com.example.praktam_2467051025.data.repository

import com.example.praktam_2467051025.data.api.RetrofitClient
import com.example.praktam_2467051025.data.model.TagihanItem

class TagihanRepository {
    suspend fun getTagihan(): List<TagihanItem> {
        return try {
            RetrofitClient.instance.getTagihan()
        } catch (e: Exception) {
            emptyList()
        }
    }
}