package com.brormoul.app.view.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.brormoul.app.R
import com.brormoul.app.databinding.FragmentPeopleBinding
import com.brormoul.app.helper.ItemListener
import com.brormoul.app.helper.PeopleAdapter
import com.brormoul.app.model.People
import com.brormoul.app.viewmodel.PeopleViewModel
import kotlinx.android.synthetic.main.fragment_people.*

class PeopleFragment : Fragment() {

    private var viewModel: PeopleViewModel = PeopleViewModel()
    private lateinit var binding: FragmentPeopleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fragment_people, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeView()

        viewModel = ViewModelProviders.of(this).get(viewModel::class.java)

        listObserve(viewModel, binding)
        loadingObserve(context!!, viewModel, binding)
    }

    private fun initializeView() {
        floatingActionButton.setOnClickListener {
            viewModel.getPeopleList()
        }
    }

    private fun listObserve(viewModel: PeopleViewModel, binding: FragmentPeopleBinding) {

        viewModel.items.observe(this, Observer {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = PeopleAdapter(context,it,  object : ItemListener {
                    override fun onItemClick(item: People) {
                        val bundle = bundleOf("userId" to item.id)
                        findNavController().navigate(R.id.detailFragment, bundle)
                    }
                    override fun onItemDelete(item: People) {
                        Toast.makeText(context, " delete ${item.id}", Toast.LENGTH_SHORT).show()
                    }

                    override fun onItemUpdate(item: People) {
                        Toast.makeText(context, " update ${item.id}", Toast.LENGTH_SHORT).show()
                    }
                })
                adapter?.notifyDataSetChanged()
            }
        })
    }

    private fun loadingObserve(context: Context,viewModel: PeopleViewModel, binding: FragmentPeopleBinding) {
        binding.rotateLoading.loadingColor = ContextCompat.getColor(context, R.color.colorPrimary)
        viewModel.isLoading.observe(this, Observer {
            if(it) {
                binding.rotateLoading.start()
            } else {
                binding.rotateLoading.stop()
            }
        })
    }
}
