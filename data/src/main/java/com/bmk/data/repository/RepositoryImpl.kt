package com.bmk.data.repository

import android.content.Context
import com.bmk.data.util.getJsonDataFromAsset
import com.bmk.domain.*
import dagger.hilt.android.qualifiers.ApplicationContext

import javax.inject.Inject


class RepositoryImpl @Inject constructor(@ApplicationContext val context: Context) :
    Repository {
    override suspend fun getData(): List<ProductResponse> {
        return context.getJsonDataFromAsset().map {
            ProductResponse(
                name = it.name,
                value = it.value,
                desc = it.desc,
                imageUrl = it.imageUrl,
                type = it.type,
                items = if (it.items != null && it.type == CATEGORY) it.items.map {
                    ItemsItem(
                        name = it.name,
                        value = it.value,
                        desc = it.desc,
                        imageUrl = it.imageUrl
                    )
                } else null
            )
        }
    }
    companion object {
        const val CATEGORY = "Category"
        const val Products = "Product"
        const val Banner = "Banner"
    }
}