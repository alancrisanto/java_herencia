/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e004;

import Entidad.Lavadora;
import Entidad.Televisor;
import Servicios.ServiciosLavadora;
import Servicios.ServiciosTelevisor;

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
        ServiciosTelevisor st = new ServiciosTelevisor();
        
        Lavadora lava = sl.crearLavadora();
        Televisor tv = st.crearTelevisor();
        
        System.out.println(lava.toString());
       
        System.out.println(tv.toString());
        
        
    }
    
}
