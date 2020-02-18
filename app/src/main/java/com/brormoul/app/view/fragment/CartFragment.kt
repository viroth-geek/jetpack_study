package com.brormoul.app.view.fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.brormoul.app.R
import com.brormoul.app.viewmodel.CartViewModel

class CartFragment : Fragment() {

    private var viewModel: CartViewModel  = CartViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProviders.of(this).get(viewModel::class.java)
        viewModel.getUserDetail(1)
        viewModel.detail.observe(this, Observer {
            Log.d("TAG", "$it")
        })
    }


}
