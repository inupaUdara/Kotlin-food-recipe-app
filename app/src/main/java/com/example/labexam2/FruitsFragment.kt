package com.example.labexam2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class FruitsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fruits, container, false)
        val btnNextFragment = view.findViewById<Button>(R.id.btnAdd)
        btnNextFragment.setOnClickListener {
            val nextFragment = AddingFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, nextFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val btnBack = view.findViewById<ImageView>(R.id.back)
        btnBack.setOnClickListener {
            val backFragment = AddRecipeFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, backFragment)
            transaction.addToBackStack(null)
            transaction.commit()


        }

        return view
    }


}