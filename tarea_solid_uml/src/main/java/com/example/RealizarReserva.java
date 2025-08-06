package com.example;

import com.example.interfaces.Notificador;
import com.example.interfaces.Reservable;

public class RealizarReserva {
    private PagoService pagoService;
    private Notificador notificador;

    public RealizarReserva(PagoService pagoService, Notificador notificador) {
        this.pagoService = pagoService;
        this.notificador = notificador;
    }

    public void ejecutar(Usuario usuario, Reservable item) {
        if (!item.verificarDisponibilidad()) {
            notificador.enviar("El servicio no está disponible.", usuario);
            return;
        }

        double precio = item.calcularPrecio();

        if (pagoService.procesarPago(precio)) {
            Reserva reserva = new Reserva(usuario, item);
            reserva.confirmar();
            notificador.enviar("Reserva confirmada. Gracias por usar TravelStay.", usuario);
        } else {
            notificador.enviar("El pago ha fallado. Intente nuevamente.", usuario);
        }
    }
}
