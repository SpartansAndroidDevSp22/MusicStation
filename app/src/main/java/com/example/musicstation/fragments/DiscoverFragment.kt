package com.example.musicstation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.musicstation.R
import com.google.android.material.tabs.TabLayout

class DiscoverFragment : Fragment() {
    lateinit var tabLayout: TabLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.tabLayout)
        tabLayout.addTab(tabLayout.newTab().setText("Recently"))
        tabLayout.addTab(tabLayout.newTab().setText("Popular"))
        tabLayout.addTab(tabLayout.newTab().setText("Similar"))

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
    }
}