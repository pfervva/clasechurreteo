package com.example.proyecto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R
import com.example.proyecto.models.Hotel

class AdapterHotel( var listHotel : MutableList<Hotel>) : RecyclerView.Adapter<ViewHholder>(){
    /*
     Método que crea la view del ViewHolderHotel
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHholder {
        val layoutInflater = LayoutInflater.from(parent. context)//objeto para crear la vista.
        val layoutItemHotel = R.layout. item_hotel //accedo al xml del item a crear.
        return ViewHholder(layoutInflater.inflate(layoutItemHotel, parent, false))
    }



    override fun getItemCount(): Int = listHotel.size

    override fun onBindViewHolder(holder: ViewHholder, position: Int) {
        TODO("Not yet implemented")
    }


}
