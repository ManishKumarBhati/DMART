package com.bmk.baseproject.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.FragmentSecondSampleBinding
import com.bmk.baseproject.item.BannerItem
import com.bmk.baseproject.item.CategoriesItem
import com.bmk.baseproject.item.ProductItem
import com.bmk.baseproject.util.ResponseState
import com.bmk.baseproject.viewmodel.SampleViewModel
import com.bmk.data.repository.RepositoryImpl
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import com.xwray.groupie.viewbinding.BindableItem
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SecondSampleFragment : BaseFragment() {
    lateinit var binding: FragmentSecondSampleBinding
    private val viewModel: SampleViewModel by viewModels()
    lateinit var section: Section
    override fun getLayout() = R.layout.fragment_second_sample

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSecondSampleBinding.bind(view)
        setupRecyclerView()
        loadData()
    }

    private fun loadData() {
        viewModel.getData().observe(viewLifecycleOwner) {
            when (it) {
                is ResponseState.Success -> {
                    val itemList = mutableListOf<BindableItem<*>>()
                    it.data.forEach { resposne ->
                        if (resposne.type == RepositoryImpl.Products)
                            itemList.add(ProductItem(resposne))
                        if (resposne.type == RepositoryImpl.Banner)
                            itemList.add(BannerItem(resposne))
                        else {
                            resposne.items?.let { items ->
                                items.forEach { item ->
                                    itemList.add(CategoriesItem(item))
                                }
                            }
                        }

                    }
                    section.addAll(itemList)
                }
//                is ResponseState.Error -> //handle error
//                is ResponseState.Loading -> //handle loading
                else -> {}
            }
        }
    }

    private fun setupRecyclerView() {
        section = Section()
        val groupAdapter = GroupAdapter<GroupieViewHolder>()
            .apply {
                add(section)
                spanCount = 3
            }

        val gridManager = GridLayoutManager(requireContext(), groupAdapter.spanCount).apply {
            spanSizeLookup = groupAdapter.spanSizeLookup
        }
        binding.rvItem.apply {
            adapter = groupAdapter

            layoutManager = gridManager
        }
    }
}
