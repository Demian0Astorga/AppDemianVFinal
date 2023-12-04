package com.example.appdemianvfinal.cliente;

public class Cliente {

    String Nombre;
    String Correo;
    String Contrasena;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }


}
