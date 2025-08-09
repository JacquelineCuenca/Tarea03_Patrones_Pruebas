package com.example.notificaciones;

import com.example.interfaces.Notificador;
import com.example.usuarios_y_roles.Usuario;

public class EmailNotificador implements Notificador {
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Email enviado a " + usuario.getCorreo() + ": " + mensaje);
    }
}
