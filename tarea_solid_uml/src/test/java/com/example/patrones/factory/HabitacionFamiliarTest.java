package com.example.patrones.factory;

import com.example.enums.EstadoHabitacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HabitacionFamiliarTest {

    @Test
    void estaDisponiblenRetornaFalse() {
        HabitacionFamiliar familiar = new HabitacionFamiliar(3, 301);
        familiar.estado = EstadoHabitacion.RESERVADA;
        assertFalse(familiar.estaDisponible());
    }

}
