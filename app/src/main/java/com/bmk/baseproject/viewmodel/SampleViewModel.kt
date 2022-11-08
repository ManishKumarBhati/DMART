package com.bmk.baseproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.bmk.baseproject.util.ResponseState
import com.bmk.domain.ProductResponse
import com.bmk.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(private val repository: Repository) :
    BaseViewModel() {
    private val mutableMainState = MutableLiveData<ResponseState<List<ProductResponse>>>()
    fun getData(): MutableLiveData<ResponseState<List<ProductResponse>>> {

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val data = repository.getData()
                mutableMainState.postValue( ResponseState.Success(data))
            }
        }
        return mutableMainState
    }


    override fun onCleared() {
        TODO("Not yet implemented")
    }
}