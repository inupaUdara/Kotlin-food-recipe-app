package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class AddingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_adding, container, false)

        val btnBack = view.findViewById<ImageView>(R.id.back)
        btnBack.setOnClickListener {
            val backFragment = FruitsFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, backFragment)
            transaction.addToBackStack(null)
            transaction.commit()


        }

        val btnAdd = view.findViewById<Button>(R.id.btnAddingIngrediants)
        btnAdd.setOnClickListener {
            val backFragment = FruitsFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, backFragment)
            transaction.addToBackStack(null)
            transaction.commit()


        }

        val btnBarcode = view.findViewById<ImageView>(R.id.barcode)
        btnBarcode.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (intent.resolveActivity(requireContext().packageManager) != null) {
                startActivity(intent)
            }
        }

        return view
    }


}