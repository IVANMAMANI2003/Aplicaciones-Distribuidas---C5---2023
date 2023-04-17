package com.example.websocketserve.model;

public class Mensaje {
    private String mensaje; //atributo

    public Mensaje() {
    }
    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    } //constructor

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
