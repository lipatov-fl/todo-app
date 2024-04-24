package com.example.todoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentAddTodoPopupBinding
import com.example.todoapp.databinding.FragmentHomeBinding

class AddTodoPopupFragment : Fragment() {

    private lateinit var binding: FragmentAddTodoPopupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddTodoPopupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerEvents()
    }

    private fun registerEvents() {
        binding.todoNextBtn.setOnClickListener {

        }
    }

}