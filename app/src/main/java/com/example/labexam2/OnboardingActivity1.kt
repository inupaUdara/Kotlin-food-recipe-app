package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val btnNavigate: Button = findViewById(R.id.onboardingBtnNxt1)
        btnNavigate.setOnClickListener{
            val intent = Intent(this,OnboardingActivity2::class.java)
            startActivity(intent)
            finish()
        }

        val btnNavigateSkip: Button = findViewById(R.id.onboardingBtnSkip1)
        btnNavigateSkip.setOnClickListener{
            val intent = Intent(this,OnboardingActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}