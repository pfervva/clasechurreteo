package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyecto.controler.Controller
import com.example.proyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var controller : Controller
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun init(){
        initRecyclerView()
        controller = Controller(this)
        controller.setAdapter()
    }


    private fun initRecyclerView() {
        binding.myRecicledView.layoutManager = LinearLayoutManager(this)
    }
}