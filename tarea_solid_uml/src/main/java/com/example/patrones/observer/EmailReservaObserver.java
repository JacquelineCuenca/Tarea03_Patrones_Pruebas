package com.example.patrones.observer;

import com.example.Usuario;
import com.example.interfaces.Notificador;

public class EmailReservaObserver implements ReservaObserver {

    private Notificador notificador;

    public EmailReservaObserver(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void onReservaCreada(String mensaje, Usuario usuario) {
        String asunto = "Confirmación de reserva TravelStay";
        String cuerpo = String.format("Hola %s,\n\n%s\n\nGracias por elegir TravelStay.", usuario.getNombre(), mensaje);
        notificador.enviar(asunto + "\n" + cuerpo, usuario);
    }

    @Override
    public void onReservaCancelada(String mensaje, Usuario usuario) {
        String asunto = "Cancelación de reserva TravelStay";
        String cuerpo = String.format(
                "Hola %s,\n\n%s\n\nLamentamos que hayas cancelado. Esperamos verte pronto.",
                usuario.getNombre(),
                mensaje);
        notificador.enviar(asunto + "\n" + cuerpo, usuario);
    }
}
