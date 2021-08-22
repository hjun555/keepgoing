package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.Fragment01Binding

class Fragment_01: Fragment() {

    private lateinit var _binding: Fragment01Binding
    //private val binding get() = _binding


    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //프라그먼트가 인터페이스를 처음으로 그릴 때 호출됨.
        //inflater --> 뷰를 그려줌
        //container --> 부모 뷰
        _binding = Fragment01Binding.inflate(inflater, container, false)
        return _binding.root
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    //번들을 받는 함수는 onActivityCreated!
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        val data = arguments?.getString("key")
        Log.d("data", data.toString())
        super.onActivityCreated(savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
    }
}