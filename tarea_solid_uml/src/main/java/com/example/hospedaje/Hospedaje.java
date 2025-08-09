package com.example.hospedaje;

import com.example.patrones.decorator.IHabitacion;
import com.example.interfaces.Reservable;

public class Hospedaje implements Reservable {
    private Hotel hotel;
    private IHabitacion habitacion;

    public Hospedaje(IHabitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double calcularPrecio() {
        return habitacion.calcularPrecio();
    }

    public boolean verificarDisponibilidad() {
        return habitacion.estaDisponible();
    }

    public void bloquearTemporalmente() {
        habitacion.reservar();
    }

    public IHabitacion getHabitacion() {
        return habitacion;
    }
    
}
