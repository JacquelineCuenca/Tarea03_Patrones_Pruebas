/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.patrones.factory;

/**
 *
 * @author User
 */
public class HabitacionEstandarCreator implements IHabitacionCreator{
    public Habitacion crearHabitacion(int idHotel, int numero) {
        return new HabitacionEstandar(idHotel, numero);
    }
}
