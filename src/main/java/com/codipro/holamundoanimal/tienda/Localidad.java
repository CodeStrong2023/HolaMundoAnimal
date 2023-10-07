package com.codipro.holamundoanimal.tienda;

public class Localidad {
    
    public String nombre;
    public int codigo_postal;
    public int coste_de_envio;

    Localidad(String nombre, int codigo_postal, int coste_de_envio) {
        this.nombre = nombre;
        this.codigo_postal = codigo_postal;
        this.coste_de_envio = coste_de_envio;
    }
    
}
