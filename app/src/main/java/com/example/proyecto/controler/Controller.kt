package com.example.proyecto.controler

import android.content.Context
import android.widget.Adapter
import com.example.proyecto.MainActivity
import com.example.proyecto.dao.DaoHotels
import com.example.proyecto.models.Hotel


class Controller (val context: Context) {
    lateinit var listHotels : MutableList<Hotel>
    lateinit var adaptadorHotel1 : Adapter
    fun setAdapter() {
        val myActivity = context as MainActivity
    }
    init{initData()
    }

    private fun initData() {
        listHotels = DaoHotels. myDao.getDataHotels().toMutableList()
    }
    fun setAdapter(){
        val myActivity = context as MainActivity
    }


    }
