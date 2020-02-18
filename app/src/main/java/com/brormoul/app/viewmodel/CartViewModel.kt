package com.brormoul.app.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.brormoul.app.helper.textHelper.TextPath
import com.brormoul.app.model.People
import com.brormoul.app.repository.serviceInterface.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CartViewModel: ViewModel() {

    var detail : MutableLiveData<People> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    fun getUserDetail(int: Int) {
        isLoading.value =  true
        val clientService = RetrofitClient.getService()
        val call: Call<People> = clientService.getUserById(int)
        call.enqueue(object : Callback<People> {
            override fun onFailure(response: Call<People>, t: Throwable) {
                Log.d(TextPath.TAG, "Error getting data")
            }
            override fun onResponse(call: Call<People>, response: Response<People>) {
                detail.value = response.body()
                isLoading.value = false
            }
        })
    }
}