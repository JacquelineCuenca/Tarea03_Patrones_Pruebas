package com.example.interfaces;

import com.example.Usuario;

public interface Notificador {
    void enviar(String mensaje, Usuario usuario);
}
