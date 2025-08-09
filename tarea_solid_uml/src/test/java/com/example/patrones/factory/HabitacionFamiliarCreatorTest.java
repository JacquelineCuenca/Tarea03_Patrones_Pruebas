package com.example.patrones.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HabitacionFamiliarCreatorTest {
    @Test
    void crearHabitacionconValoresInvalidos() {
        HabitacionFamiliarCreator creator = new HabitacionFamiliarCreator();
        Habitacion habitacion = creator.crearHabitacion(-1, -100);

        assertNotNull(habitacion);
        assertEquals(-1, habitacion.idHotel);
        assertEquals(-100, habitacion.numero);
    }
}
