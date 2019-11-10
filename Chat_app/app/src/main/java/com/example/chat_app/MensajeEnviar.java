package com.example.chat_app;

import java.util.Map;

public class MensajeEnviar extends Mensaje {
    private Map hora;

    public MensajeEnviar() {
    }

    public MensajeEnviar(Map hora) {
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String urlfoto, String nombre, String fotoperfil, String type_mensaje, Map hora) {
        super(mensaje, urlfoto, nombre, fotoperfil, type_mensaje);
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String nombre, String fotoperfil, String type_mensaje, Map hora) {
        super(mensaje, nombre, fotoperfil, type_mensaje);
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}
