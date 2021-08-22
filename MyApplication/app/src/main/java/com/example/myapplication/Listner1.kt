package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityListner1Binding

class Listner1 : AppCompatActivity() {
    private lateinit var binding: ActivityListner1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListner1Binding.inflate(layoutInflater)
        val view = binding.root
//        setContentView(R.layout.activity_listner1)
        setContentView(view)

        binding.button1.setOnClickListener {
//            Log.d("click", "click!!")
            val intent1 = Intent(this@Listner1, Listner2::class.java)
            intent1.apply {
                intent1.putExtra("number1", 10)
                intent1.putExtra("number2", 20)
            }
            startActivityForResult(intent1, 200)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 200){
            Log.d("request", "request received!")
            val result = data?.getIntExtra("result", 0)
            Log.d("request", "result value is " + result)
        }
    }
}