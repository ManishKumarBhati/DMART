package com.bmk.data.data

import com.google.gson.annotations.SerializedName


data class DataResponse(

    @field:SerializedName("imageUrl")
    val imageUrl: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("type")
    val type: String,

    @field:SerializedName("value")
    val value: String,

    @field:SerializedName("items")
    val items: List<ItemsItem>?,

    @field:SerializedName("desc")
    val desc: String
)

data class ItemsItem(

    @field:SerializedName("imageUrl")
    val imageUrl: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("value")
    val value: String,

    @field:SerializedName("desc")
    val desc: String
)
