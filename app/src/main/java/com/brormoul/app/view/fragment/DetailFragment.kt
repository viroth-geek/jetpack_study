package com.brormoul.app.view.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.brormoul.app.BR
import com.brormoul.app.R
import com.brormoul.app.databinding.FragmentDetailBinding
import com.brormoul.app.viewmodel.CartViewModel

class DetailFragment : Fragment() {

    private var viewModel: CartViewModel = CartViewModel()
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fragment_detail,container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(viewModel::class.java)
        viewModel.getUserDetail(arguments?.getString("userId")!!.toInt())

        detailObserve(viewModel, binding)
        loadingObserve(viewModel, binding)
    }

    private fun detailObserve(viewModel: CartViewModel, binding: FragmentDetailBinding) {
        viewModel.detail.observe(this, Observer {
            Log.d("USER_DETAIL", "$it")
            binding.setVariable(BR.detail, it)
            binding.executePendingBindings()
        })
    }

    private fun loadingObserve(viewModel: CartViewModel, binding: FragmentDetailBinding) {
        viewModel.isLoading.observe(this, Observer {
            val progressBar = binding.progressBar
            if (it) {
                progressBar.visibility = View.VISIBLE
            }
            else {
                progressBar.visibility = View.GONE
            }
        })
    }

}
