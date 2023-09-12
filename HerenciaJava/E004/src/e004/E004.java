/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e004;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Servicios.ServiciosElectrodomesticos;
import Servicios.ServiciosLavadora;

/**
 *
 * @author Crisvall
 */
public class E004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ServiciosElectrodomesticos serEl = new ServiciosElectrodomesticos();
        
//        Electrodomestico el = serEl.crearElectrodomestico();
//        serEl.precioFinal();
//        
//        System.out.println(el.getColor());
//        System.out.println(el.getConsumo());
//        System.out.println(el.toString());

        ServiciosLavadora sl = new ServiciosLavadora();
        
        Lavadora lava = sl.crearLavadora();
        
        System.out.println(lava.getPeso());
        System.out.println(lava.getConsumo());
        System.out.println(lava.getColor());
        System.out.println(lava.getCarga());
        System.out.println(lava.getPrecio());
        
        
    }
    
}
