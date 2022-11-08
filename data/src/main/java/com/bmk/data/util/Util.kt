package com.bmk.data.util

import android.content.Context
import com.bmk.data.data.DataResponse
import com.bmk.domain.ProductResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import timber.log.Timber
import java.io.IOException


 fun Context.getJsonDataFromAsset(): List<DataResponse> {

    lateinit var jsonString: String
    try {
        jsonString = assets.open("data.json")
            .bufferedReader()
            .use { it.readText() }
    } catch (ioException: IOException) {
        Timber.d(ioException)
    }

    val listCountryType = object : TypeToken<List<DataResponse>>() {}.type
    return Gson().fromJson(jsonString, listCountryType)
}
