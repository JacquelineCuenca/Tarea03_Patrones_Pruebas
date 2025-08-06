package com.example;

import java.util.Scanner;

import com.example.interfaces.GestorDeAccion;

public class GestorConsola implements GestorDeAccion {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerAccion(Incidente incidente) {
        System.out.println("¿Qué desea hacer con el incidente #" + incidente.getId() + "? (resolver/escalar): ");
        return scanner.nextLine().toLowerCase();
    }

}
