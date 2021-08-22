package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityFragmentBinding

class Fragment : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentOne: Fragment_01 = Fragment_01()
        //fragment에 데이터를 넣기 위해서는 bundle과 argument를 활용해야한다.
        val bundle: Bundle = Bundle()
        bundle.putString("key", "hello im bundle")
        fragmentOne.arguments = bundle

        binding.button.setOnClickListener {
            val fragmentManager: FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(binding.placeholder.id, fragmentOne)
            fragmentTransaction.commit()
        }


    }
}