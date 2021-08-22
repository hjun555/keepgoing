package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityListner1Binding
import com.example.myapplication.databinding.ActivityListner2Binding

class Listner2 : AppCompatActivity() {
    private lateinit var binding: ActivityListner2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListner2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button2.setOnClickListener {
            Log.d("click", "click in intent 2")
            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)
            val result = number1 + number2
            val resultintent = Intent()
            resultintent.putExtra("result", result)
            setResult(Activity.RESULT_OK, resultintent)
            finish()
        }
    }

}