package com.example.proyectojavafx;

public class persona {
    public String nombre;
    public String edad;
    public String tlfno;

    public persona(String nombre, String edad, String tlfno) {
        this.nombre = nombre;
        this.edad = edad;
        this.tlfno = tlfno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getTlfno() {
        return tlfno;
    }
}
