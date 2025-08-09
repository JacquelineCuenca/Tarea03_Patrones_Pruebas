package com.example.patrones.observer;

import com.example.Usuario;

public interface ReservaObserver {

    void onReservaCreada(String mensaje, Usuario usuario);

    void onReservaCancelada(String mensaje, Usuario usuario);
}
