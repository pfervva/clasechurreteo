package com.example.proyecto.dao

import com.example.proyecto.interfaces.Interfaz
import com.example.proyecto.models.Hotel
import com.example.proyecto.objects_models.Repository

class DaoHotels private constructor(): Interfaz {
    companion object {
        val myDao: DaoHotels by lazy{ //lazy delega a un primer acceso
            DaoHotels() //Me creo sólo este objeto una vez.
        }
    }
    //Método que accede a la BBDD y devuelve todos los datos
    override
    fun getDataHotels(): List<Hotel> = Repository. listHotels
}