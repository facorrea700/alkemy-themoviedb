package com.example.themoviedb.movies

import ViewPagerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.viewpager2.widget.ViewPager2
import com.example.themoviedb.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewPagerAdapter = ViewPagerAdapter(this)
        val pager = view.findViewById<ViewPager2>(R.id.pager)
        pager.adapter = viewPagerAdapter
    }
}
