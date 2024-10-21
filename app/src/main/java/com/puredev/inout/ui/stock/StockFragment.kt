package com.puredev.inout.ui.stock

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.puredev.inout.databinding.FragmentBuyListBinding

class StockFragment : Fragment() {

    private var _binding: FragmentBuyListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBuyListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}