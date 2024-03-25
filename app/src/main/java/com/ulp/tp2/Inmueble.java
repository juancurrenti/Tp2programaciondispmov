package com.ulp.tp2;

public class Inmueble {
    private int foto;
    private String direccion;
    private double precio;

    public int getFoto() {
        return foto;
    }

    public Inmueble(int foto, String direccion, double precio) {
        this.foto = foto;
        this.direccion = direccion;
        this.precio = precio;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
