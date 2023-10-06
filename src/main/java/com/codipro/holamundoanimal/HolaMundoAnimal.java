package com.codipro.holamundoanimal;
import com.codipro.holamundoanimal.producto.*;
import com.codipro.holamundoanimal.tienda.*;

public class HolaMundoAnimal {

    public static void main(String[] args) {
        
        Tienda tienda = new Tienda("Hola Mundo Animal");

        Producto[] productos = new Producto[] {
                new Producto()
                        .definirNombre("Kit descanso perro chico")
                        .definirDetalle("Kit: Cama chica, manta chica, ropa")
                        .definirPrecio(3000),
                new Producto()
                        .definirNombre("Kit descanso perro grande")
                        .definirDetalle("Kit: Cama grande, manta grande, ropa")
                        .definirPrecio(3500),
                new Producto()
                        .definirNombre("Kit baño perro chico")
                        .definirDetalle("Kit: Shampoo, cepillo, toalla pequeña")
                        .definirPrecio(4000),
                new Producto()
                        .definirNombre("Kit baño perro grande")
                        .definirDetalle("Kit: Shampoo, cepillo, toalla grande")
                        .definirPrecio(4300),
                new Producto()
                        .definirNombre("Kit paseo perro chico")
                        .definirDetalle("Kit: correa, pretal chico, porta bolsa para juntar heces")
                        .definirPrecio(5000),
                new Producto()
                        .definirNombre("Kit paseo perro grande")
                        .definirDetalle("Kit: correa, pretal grande, porta bolsa para juntar heces")
                        .definirPrecio(5200),
        };

        tienda.registrar_productos(productos);

        // Se limipia la consola
        System.out.print("\033[H\033[2J");

        tienda.showBanner();

        System.out.println("");

        tienda.mostrarProductos();
        
    }
}
