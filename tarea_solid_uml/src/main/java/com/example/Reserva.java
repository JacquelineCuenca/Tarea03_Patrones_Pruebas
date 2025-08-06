package com.example;

import java.time.LocalDateTime;

import com.example.interfaces.Reservable;

public class Reserva {
    private Usuario usuario;
    private Reservable item;
    private LocalDateTime fecha;
    private String estado; // pendiente, confirmada, cancelada

    public Reserva(Usuario usuario, Reservable item) {
        this.usuario = usuario;
        this.item = item;
        this.fecha = LocalDateTime.now();
        this.estado = "pendiente";
    }

    public void confirmar() {
        this.estado = "confirmada";
    }

    public String getEstado() {
        return estado;
    }
}
