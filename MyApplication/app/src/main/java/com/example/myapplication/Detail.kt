package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val place = intent.getStringExtra("place")

        if (place.equals("gangnam")) {
            binding.detailImg1.setImageResource(R.drawable.gangnam_01)
            binding.detailTxt1.setText("1분 전")
            binding.detailImg2.setImageResource(R.drawable.gangnam_02)
            binding.detailTxt2.setText("10분 전")
            binding.detailImg3.setImageResource(R.drawable.gangnam_03)
            binding.detailTxt3.setText("30분 전")
        } else if(place.equals("hongdae")) {
            binding.detailImg1.setImageResource(R.drawable.hongdae_01)
            binding.detailTxt1.setText("1분 전")
            binding.detailImg2.setImageResource(R.drawable.hongdae_02)
            binding.detailTxt2.setText("10분 전")
            binding.detailImg3.setImageResource(R.drawable.hongdae_03)
            binding.detailTxt3.setText("30분 전")
        } else {
            Log.d("error", "place name passed wrong")
        }

        setContentView(binding.root)

        binding.backward.setOnClickListener {
            finish()
        }
    }
}