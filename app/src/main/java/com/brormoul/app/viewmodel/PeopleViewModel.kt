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

class PeopleViewModel: ViewModel() {

    var items: MutableLiveData<ArrayList<People>> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        getPeopleList()
    }

    fun getPeopleList() {
        isLoading.value = true
        val clientService = RetrofitClient.getService()
        val call: Call<ArrayList<People>> = clientService.getUsers()

        call.enqueue(object : Callback<ArrayList<People>> {
            override fun onFailure(response: Call<ArrayList<People>>, t: Throwable) {
                Log.d(TextPath.TAG, "Error getting data")
            }
            override fun onResponse(call: Call<ArrayList<People>>, response: Response<ArrayList<People>>) {
                isLoading.value = false
                items.value = response.body()

            }
        })
    }
}