package com.codipro.holamundoanimal.tienda;
import com.codipro.holamundoanimal.producto.*;
import java.util.ArrayList;
import java.util.List;


public class Tienda {
    
    String nombre;
    String banner;
    List<IProducto> productos = new ArrayList<>();
    int precio_total = 0;
    Localidad destino;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.setBanner(nombre);
        this.destino = new Localidad("Retiro en la tienda", 0000,0);
    }

    public void setBanner(String nombre) {

        int maxima_longitud = 80;

        String mensaje = "¡Bienvenido a " + nombre + "!";

        int lados = maxima_longitud - mensaje.length() - 1;

        this.banner = "%".repeat(maxima_longitud) + "\n";
        this.banner += "%".repeat(((int) lados / 2));
        this.banner += " " + mensaje + " ";
        this.banner += "%".repeat(((int) lados / 2)) + "\n";
        this.banner += "%".repeat(maxima_longitud);

    }

    public void showBanner() {
        System.out.println(this.banner);
        System.out.println("");
    }

    public void mostrarProductos() {

        for (int index = 0; index < this.productos.size(); index++) {
            IProducto producto = this.productos.get(index);
            System.out.println(index + ". " + producto.obtenerNombre() + " ($" + producto.obtenerPrecio() + ")");
        }

    }

    public void registrar_productos(IProducto[] productos) {
        for (IProducto producto : productos) {
            this.productos.add(producto);
        }
    }
    
    public void enviarHasta(Localidad localidad){
        this.destino = localidad;
    }
    
    public int obtenerCosteTotal(){
        return this.destino.coste_de_envio;
    }
    
}
