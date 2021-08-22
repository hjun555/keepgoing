package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ScrollView
import com.example.myapplication.databinding.ActivityJustfortestBinding

class Test : AppCompatActivity() {
    private lateinit var binding: ActivityJustfortestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJustfortestBinding.inflate(layoutInflater)
        Log.d("scroll", "before1")

        setContentView(binding.root)

        Log.d("scroll", "before2")
        binding.scrollView.smoothScrollTo(0,0)
        Log.d("scroll", "after")
    }
}