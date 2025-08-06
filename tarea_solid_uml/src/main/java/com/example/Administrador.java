package com.example;

public class Administrador extends Usuario{

    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }
    
    public void configurarPoliticas(){}

    public void  ajustarPlazas(PaseoTuristico paseo){}
    
    public void integrarServicio(){}
}
