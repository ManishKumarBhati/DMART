package com.bmk.domain

data class ProductResponse(
    val imageUrl: String,
    val name: String,
    val type: String,
    val value: String,
    val items: List<ItemsItem>?,
    val desc: String
)

data class ItemsItem(
    val imageUrl: String,
    val name: String,
    val value: String,
    val desc: String
)

