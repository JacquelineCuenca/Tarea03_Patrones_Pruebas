package com.example.patrones.factory;
import com.example.enums.EstadoHabitacion;

public abstract class Habitacion {
    protected int idHotel;
    protected int numero;
    protected EstadoHabitacion estado; // disponible, reservada, ocupada, mantenimiento

    public Habitacion(int idHotel, int numero) {
        this.idHotel = idHotel;
        this.numero= numero;
        this.estado = EstadoHabitacion.DISPONIBLE;
    }

    public boolean estaDisponible() {
       return estado.equals(EstadoHabitacion.DISPONIBLE);
 
    }

    public void reservar() {
        this.estado = EstadoHabitacion.RESERVADA;
    }
    
    public abstract void mostrarDetalles();

}
