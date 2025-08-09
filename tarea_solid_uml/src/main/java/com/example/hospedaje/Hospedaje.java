package com.example.hospedaje;

import com.example.interfaces.Reservable;

public class Hospedaje implements Reservable {
    private Hotel hotel;
    private Habitacion habitacion;
    private double precio;

    public Hospedaje(Habitacion habitacion, double precio) {
        this.habitacion = habitacion;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }

    public boolean verificarDisponibilidad() {
        return habitacion.estaDisponible();
    }

    public void bloquearTemporalmente() {
        habitacion.reservar();
    }
}
