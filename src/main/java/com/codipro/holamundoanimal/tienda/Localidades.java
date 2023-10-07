package com.codipro.holamundoanimal.tienda;

public class Localidades {

    public static Localidad[] get(){
        
        Localidad[] localidades = new Localidad[]{
            new Localidad("Maipu", 5515, 1000),
            new Localidad("Guaymallen", 5521, 1200),
            new Localidad("Godoy Cruz", 5501, 1300),
            new Localidad("Mendoza", 5500, 1400),
            new Localidad("Las Heras", 5539, 1550),
            new Localidad("Lujan de cuyo", 5507, 1700),
            new Localidad("San Rafael", 5600, 0),
            new Localidad("Malargue", 5613, 0),
            new Localidad("General Alvear", 5620, 0)
        };
        
        return localidades;
        
    }
    
}
