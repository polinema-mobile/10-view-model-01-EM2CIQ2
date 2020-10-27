package com.unero.courtcounter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.unero.courtcounter.R
import com.unero.courtcounter.databinding.FragmentCounterBinding
import com.unero.courtcounter.viewmodels.CounterViewModels

class CounterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCounterBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_counter, container, false)
        val mViewModels: CounterViewModels = ViewModelProvider(this).get(CounterViewModels::class.java)
        binding.counterViewModel = mViewModels
        binding.lifecycleOwner = this
        return binding.root
    }
}