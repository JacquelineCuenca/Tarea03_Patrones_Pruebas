package com.example;

import java.time.LocalDateTime;

import com.example.interfaces.Reservable;
import com.example.patrones.observer.ReservaSubject;

public class Reserva extends ReservaSubject {
    private Usuario usuario;
    private Reservable item;
    private LocalDateTime fecha;
    private String estado;
    // pendiente, confirmada, cancelada
    private String id;

    public Reserva(Usuario usuario, Reservable item) {
        this.usuario = usuario;
        this.item = item;
        this.fecha = LocalDateTime.now();
        this.estado = "pendiente";
        this.id = java.util.UUID.randomUUID().toString();
    }

    public void confirmar() {
        this.estado = "confirmada";
        notificarReservaCreada("Reserva confirmada ID: " + id,  usuario);
    }

    public void cancelar() {
        this.estado = "cancelada";
        notificarReservaCancelada("Reserva cancelada ID: " + id, usuario);
    }

    public String getEstado() {
        return estado;
    }
}
