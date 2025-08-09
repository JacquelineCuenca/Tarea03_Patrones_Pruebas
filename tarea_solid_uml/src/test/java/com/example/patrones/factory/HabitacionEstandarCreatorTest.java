package com.example.patrones.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HabitacionEstandarCreatorTest {

    @Test
    void crearHabitacionSinError() {
        HabitacionEstandarCreator creator = new HabitacionEstandarCreator();
        Habitacion habitacion = creator.crearHabitacion(4, 404);

        assertNotNull(habitacion);
        assertEquals(4, habitacion.idHotel);
        assertEquals(404, habitacion.numero);
        assertTrue(habitacion instanceof HabitacionEstandar);
    }
}
