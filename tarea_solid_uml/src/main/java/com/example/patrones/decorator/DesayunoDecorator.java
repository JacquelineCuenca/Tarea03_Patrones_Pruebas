package com.example.patrones.decorator;

public class DesayunoDecorator extends HabitacionDecorator {
    private double costoDesayuno;

    public DesayunoDecorator(IHabitacion habitacion, double costoDesayuno) {
        super(habitacion);
        this.costoDesayuno = costoDesayuno;
    }

    @Override
    public double calcularPrecio() {
        return habitacion.calcularPrecio() + costoDesayuno;
    }

    @Override
    public void mostrarDetalles() {
        habitacion.mostrarDetalles();
        System.out.println(" + Desayuno incluido ($" + costoDesayuno + ")");
    }
}
