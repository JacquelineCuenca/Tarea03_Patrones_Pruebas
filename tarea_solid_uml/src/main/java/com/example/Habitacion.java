package com.example;
import com.example.enums.EstadoHabitacion;
import com.example.enums.TipoHabitacion;

public class Habitacion {
    private int idHotel;
    private int numeroHabitacion;
    private TipoHabitacion tipo;
    private EstadoHabitacion estado; // disponible, reservada, ocupada, mantenimiento

    public Habitacion(int idHotel, int numeroHabitacion) {
        this.idHotel = idHotel;
        this.numeroHabitacion= numeroHabitacion;
        this.tipo = TipoHabitacion.ESTANDAR;
        this.estado = EstadoHabitacion.DISPONIBLE;
    }

    public boolean estaDisponible() {
        if(estado.equals(EstadoHabitacion.DISPONIBLE) ) return true;
        else{return false;}    
    }

    public void reservar() {
        this.estado = EstadoHabitacion.RESERVADA;
    }
}
