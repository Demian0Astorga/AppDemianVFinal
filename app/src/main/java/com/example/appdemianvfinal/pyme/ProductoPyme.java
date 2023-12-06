package com.example.appdemianvfinal.pyme;

public class ProductoPyme {

    String NombreP;
    int Precio;

    public ProductoPyme(String nombreP, int precio) {
        NombreP = nombreP;
        Precio = precio;
    }

    public String getNombreP() {
        return NombreP;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

}
