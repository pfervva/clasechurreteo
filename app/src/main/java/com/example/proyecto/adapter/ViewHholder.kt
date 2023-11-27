package com.example.proyecto.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.databinding.ItemHotelBinding
import com.example.proyecto.models.Hotel

class ViewHholder(view : View): RecyclerView.ViewHolder (view) {
    lateinit var binding: ItemHotelBinding

}
//Esa view es la vista inflada del elemento a intesertar en recicly view, esa view se crea en el adapter
fun renderize(hotel : Hotel){
    binding.txtviewName.setText(hotel. name)
    binding.txtviewCity.setText(hotel. city)
    binding.txtviewProvince.setText(hotel. province)
    binding.txtviewPhone.setText(hotel. phone)
}

