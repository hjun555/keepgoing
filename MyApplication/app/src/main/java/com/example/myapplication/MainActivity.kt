package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.img1.setImageResource(R.drawable.gangnam_01)
        binding.placeInfo1.setText("강남")
        binding.img2.setImageResource(R.drawable.hongdae_01)
        binding.placeInfo2.setText("홍대")
        setContentView(binding.root)

        binding.img1.setOnClickListener {
            val intent1 = Intent(this@MainActivity, Detail::class.java)
            intent1.apply {
                intent1.putExtra("number1", 10)
                intent1.putExtra("place", "gangnam")
            }
            startActivity(intent1)
        }

        binding.img2.setOnClickListener {
            val intent2 = Intent(this@MainActivity, Detail::class.java)
            intent2.apply {
                intent2.putExtra("number1", 10)
                intent2.putExtra("place", "hongdae")
            }
            startActivity(intent2)
        }
    }
}