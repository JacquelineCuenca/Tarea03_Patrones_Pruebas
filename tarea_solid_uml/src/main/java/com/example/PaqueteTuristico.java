package com.example;

import com.example.interfaces.Reservable;

public class PaqueteTuristico implements Reservable {
    private Hospedaje hospedaje;
    private PaseoTuristico paseo;
    private double descuento;

    public PaqueteTuristico(Hospedaje hospedaje, PaseoTuristico paseo, double descuento) {
        this.hospedaje = hospedaje;
        this.paseo = paseo;
        this.descuento = descuento;
    }

    public double calcularPrecio() {
        return hospedaje.calcularPrecio() + paseo.calcularPrecio() - descuento;
    }

    public boolean verificarDisponibilidad() {
        return hospedaje.verificarDisponibilidad() && paseo.verificarDisponibilidad();
    }


}
