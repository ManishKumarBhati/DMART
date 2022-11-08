package com.bmk.baseproject.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.FragmentSampleBinding
import com.bmk.baseproject.helper.Helper
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SampleFragment : BaseFragment() {
    lateinit var binding: FragmentSampleBinding

    @Inject
    lateinit var helper: Helper
    override fun getLayout(): Int {
        return R.layout.fragment_sample
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSampleBinding.bind(view)
        binding.btnAss1.setOnClickListener {
            findNavController().navigate(R.id.nav_to_third_frag)
        }
        binding.btnAss2.setOnClickListener {
            findNavController().navigate(R.id.nav_to_second_frag)
        }
    }

}