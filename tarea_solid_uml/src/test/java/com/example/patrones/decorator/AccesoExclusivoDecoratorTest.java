package com.example.patrones.decorator;

import com.example.patrones.factory.HabitacionEstandar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccesoExclusivoDecoratorTest {

    @Test
    void testPrecioConAccesoExclusivo() {
        IHabitacion hab = new HabitacionEstandar(1, 101);
        hab = new AccesoExclusivoDecorator(hab, 35.0);
        assertEquals(135.0, hab.calcularPrecio(), 0.01);
    }

    @Test
    void testDetallesIncluyenAcceso() {
        IHabitacion hab = new HabitacionEstandar(1, 102);
        hab = new AccesoExclusivoDecorator(hab, 35.0);
        // Solo verificamos que no lanza excepción y muestra detalles
        assertDoesNotThrow(hab::mostrarDetalles);
    }

    @Test
    void testCombinacionConDesayunoYAcceso() {
        IHabitacion hab = new HabitacionEstandar(1, 103);
        hab = new DesayunoDecorator(hab, 20.0);
        hab = new AccesoExclusivoDecorator(hab, 35.0);
        assertEquals(155.0, hab.calcularPrecio(), 0.01);
    }
}
