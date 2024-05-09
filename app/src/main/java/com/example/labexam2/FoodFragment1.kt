package com.example.labexam2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class FoodFragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_food1, container, false)

//        val btnBack = view.findViewById<ImageView>(R.id.back)
//        btnBack.setOnClickListener {
//            val backFragment = HomeFragment()
//            val transaction = requireActivity().supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.frameLayout, backFragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//
//
//        }
        return view
    }


}