package com.bmk.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

interface Repository {
    suspend fun getData(): List<ProductResponse>
}

