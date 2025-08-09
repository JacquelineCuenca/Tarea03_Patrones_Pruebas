package com.example;

import java.util.List;

import com.example.interfaces.Reservable;
import com.example.patrones.observer.ReservaObserver;

public class RealizarReserva {
    private PagoService pagoService;
    private List<ReservaObserver> observers;

    public RealizarReserva(PagoService pagoService, List<ReservaObserver> observers) {
        this.pagoService = pagoService;
        this.observers = observers;
    }

    public void ejecutar(Usuario usuario, Reservable item) {
        if (!item.verificarDisponibilidad()) {

            if (!observers.isEmpty()) {
                observers.get(0).onReservaCancelada("El servicio no está disponible.", usuario);
            }
            return;
        }

        double precio = item.calcularPrecio();

        if (pagoService.procesarPago(precio)) {
            Reserva reserva = new Reserva(usuario, item);

            for (ReservaObserver observer : observers) {
                reserva.agregarObserver(observer);
            }

            reserva.confirmar();
        } else {
            // Pago fallido, notificamos con el primer observer (por ejemplo)
            if (!observers.isEmpty()) {
                observers.get(0).onReservaCancelada("El pago ha fallado. Intente nuevamente.", usuario);
            }
        }
    }
}