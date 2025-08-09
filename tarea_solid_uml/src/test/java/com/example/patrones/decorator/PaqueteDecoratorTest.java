package com.example.patrones.decorator;

import com.example.hospedaje.Hospedaje;
import com.example.patrones.factory.HabitacionEstandar;
import com.example.turismo_y_paseos.PaseoTuristico;
import com.example.turismo_y_paseos.PaqueteTuristico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaqueteDecoratorTest {

    @Test
    void testPrecioConTraslado() {
        IHabitacion hab = new HabitacionEstandar(1, 101);
        Hospedaje hospedaje = new Hospedaje(hab);
        PaseoTuristico paseo = new PaseoTuristico("Tour Aventura", 120.0);
        PaqueteTuristico paqueteBase = new PaqueteTuristico(hospedaje, paseo, 30.0);
        IPaqueteTuristico paquete = new TrasladoDecorator(paqueteBase, 40.0);
        assertEquals(230.0, paquete.calcularPrecio(), 0.01);
    }

    @Test
    void testPrecioConVariosDecoradores() {
        IHabitacion hab = new HabitacionEstandar(1, 101);
        Hospedaje hospedaje = new Hospedaje(hab);
        PaseoTuristico paseo = new PaseoTuristico("Tour Aventura", 120.0);
        PaqueteTuristico paqueteBase = new PaqueteTuristico(hospedaje, paseo, 30.0);
        IPaqueteTuristico paquete = new TrasladoDecorator(paqueteBase, 40.0);
        paquete = new CenaTematicaDecorator(paquete, 60.0);
        paquete = new SpaDecorator(paquete, 80.0);
        assertEquals(370.0, paquete.calcularPrecio(), 0.01);
    }

    @Test
    void testDisponibilidadPaquete() {
        IHabitacion hab = new HabitacionEstandar(1, 101);
        Hospedaje hospedaje = new Hospedaje(hab);
        PaseoTuristico paseo = new PaseoTuristico("Tour Aventura", 120.0);
        PaqueteTuristico paqueteBase = new PaqueteTuristico(hospedaje, paseo, 0.0);
        IPaqueteTuristico paquete = new TrasladoDecorator(paqueteBase, 40.0);
        assertTrue(paquete.verificarDisponibilidad());
    }
}
