package com.example.turismo_y_paseos;

import com.example.hospedaje.Hospedaje;
import com.example.patrones.decorator.IPaqueteTuristico;

public class PaqueteTuristico implements IPaqueteTuristico {
    private Hospedaje hospedaje;
    private PaseoTuristico paseo;
    private double descuento;

    public PaqueteTuristico(Hospedaje hospedaje, PaseoTuristico paseo, double descuento) {
        this.hospedaje = hospedaje;
        this.paseo = paseo;
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return hospedaje.calcularPrecio() + paseo.calcularPrecio() - descuento;
    }

    @Override
    public boolean verificarDisponibilidad() {
        return hospedaje.verificarDisponibilidad() && paseo.verificarDisponibilidad();
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Paquete turístico:");
        if (hospedaje.getHabitacion() != null) {
            hospedaje.getHabitacion().mostrarDetalles();
        }
        System.out.println("Incluye paseo: " + paseo);
        System.out.println("Descuento aplicado: $" + descuento);
    }


}
