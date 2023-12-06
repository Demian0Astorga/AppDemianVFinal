package com.example.appdemianvfinal.pyme;

public class ProductoPyme {

    String NombreP;
    int Precio;
    String DescripcionP;

    public void setDescripcionP(String descripcionP) {
        DescripcionP = descripcionP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }


    public ProductoPyme(String nombreP, int precio,String descripcionP) {
        NombreP = nombreP;
        Precio = precio;
        DescripcionP = descripcionP;
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
