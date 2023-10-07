package com.codipro.holamundoanimal;
import com.codipro.holamundoanimal.producto.*;
import com.codipro.holamundoanimal.tienda.*;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class HolaMundoAnimal {
    
    public static void limpiar_pantalla(){
        System.out.print("\033[H\033[2J");
    }

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

        HolaMundoAnimal.limpiar_pantalla();
        
        tienda.showBanner();
        
        Localidad localidad = HolaMundoAnimal.elegirLocalidad();
        
        tienda.enviarHasta(localidad);

        HolaMundoAnimal.limpiar_pantalla();
        
        System.out.println("");
        
        tienda.showBanner();
        
        System.out.println("El precio final es de: " + tienda.obtenerCosteTotal());
        
        System.out.println("");
        
        tienda.mostrarProductos();
        
        
        
    }
    
    public static Localidad elegirLocalidad(){
        
        Localidad[] localidades = Localidades.get();
        int localidad_seleccionada = -1;
        boolean mostrar_mensaje_de_error = false;
        String mensaje_de_error = "Por favor, ingrese un indice valido()";
        
        Function<Integer, Boolean> fuera_de_rango = (Integer indice) -> {
            return indice < 0 || indice >= localidades.length;
        };
        
        do{
        
            for(int i = 0; i < localidades.length; i++){
                Localidad localidad = localidades[i];
                System.out.println((i + 1) + " - " + localidad.nombre + "(" + localidad.codigo_postal + ")");
            }
            
            try {
                
                if(mostrar_mensaje_de_error){
                    System.out.println();
                    System.out.println(mensaje_de_error);
                    System.out.println();
                }
                
                Scanner entrada = new Scanner(System.in);
                
                System.out.print("Ingrese el indice correspondiente a su ciudad: ");
                
                localidad_seleccionada = Integer.parseInt(entrada.nextLine());
                
                localidad_seleccionada -= 1;
                
                if(fuera_de_rango.apply(localidad_seleccionada)){
                    throw new Exception();
                }
                
            } catch(Exception e) {
                
                localidad_seleccionada = -1;
                mostrar_mensaje_de_error = true;
            
            }
        
        }while(fuera_de_rango.apply(localidad_seleccionada));
        
        return localidades[localidad_seleccionada];
        
    }
}
