package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btnNavigate: Button = findViewById(R.id.onboardingBtnNxt2)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, OnboardingActivity3::class.java)
            startActivity(intent)
            finish()
        }

        val btnNavigateSkip: Button = findViewById(R.id.onboardingBtnSkip2)
        btnNavigateSkip.setOnClickListener{
            val intent = Intent(this,OnboardingActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}