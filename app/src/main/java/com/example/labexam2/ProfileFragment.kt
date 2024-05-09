package com.example.labexam2


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val btnSignOut = view.findViewById<TextView>(R.id.btnSignOut)
        btnSignOut.setOnClickListener {

            val intent = Intent(activity, SigninActivity::class.java)
            startActivity(intent)


        }

        val btnNextFragment = view.findViewById<LinearLayout>(R.id.layoutFood1)
        btnNextFragment.setOnClickListener {
            val nextFragment = FoodFragment1()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, nextFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view
    }


}