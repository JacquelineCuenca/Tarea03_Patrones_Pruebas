package com.example;

import com.example.enums.EstadoIncidente;
import com.example.interfaces.GestorDeAccion;

public class AgenteDeSoporte extends Usuario{


    public AgenteDeSoporte(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

 
    public void gestionarIncidente(Incidente incidente, GestorDeAccion gestorDeAccion) {
        System.out.println("Gestionando incidente de: " + incidente.getDescripcion());

        incidente.setEstado(EstadoIncidente.EN_PROCESO);
        System.out.println("Incidente en proceso");

         String accion = gestorDeAccion.obtenerAccion(incidente);

        switch (accion) {
            case "resolver":
                incidente.resolverIncidente();
                break;
            case "escalar":
                incidente.escalar();
                break;
            default:
                System.out.println("Acción no válida.");
        }
    }
}
