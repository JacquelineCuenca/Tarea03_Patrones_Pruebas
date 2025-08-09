/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.patrones.factory;

/**
 *
 * @author User
 */
public class HabitacionFamiliar extends Habitacion {
    private double precio = 180.0;
    public HabitacionFamiliar(int idHotel, int numero) {
        super(idHotel, numero);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Habitación FAMILIAR Nº " + numero + " - Hotel ID: " + idHotel + " - Estado: " + estado + " - Precio: $" + precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}