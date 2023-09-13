/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 */
public class ServiciosTelevisor {
    Scanner sc = new Scanner(System.in);
    ServiciosElectrodomesticos servElc = new ServiciosElectrodomesticos();
    Televisor televisor = new Televisor();
    
    public Televisor crearTelevisor (){
        
        Electrodomestico elect = servElc.crearElectrodomestico();
        
        televisor.setPeso(elect.getPeso());
        televisor.setConsumo(elect.getConsumo());
        televisor.setColor(elect.getColor());
        televisor.setPrecio(elect.getPrecio());
        
        System.out.println("Ingrese Resolución de TV");
        televisor.setResolution(sc.nextInt());
        
        sc.nextLine();

        System.out.println("Tiene tdt? Si / No");
        String resp = sc.nextLine();
        
        if (resp.equalsIgnoreCase("si")){
            televisor.setTdt(true);
        } else {
            televisor.setTdt(false);
        }
        
        int precio = precioFinal();
        
        televisor.setPrecio(precio);
        
        return televisor;
              
    }
    
    public int precioFinal () {
        int precio = servElc.precioFinal();
        int pulgadas = televisor.getResolution();
        boolean tdt = televisor.getTdt();
        
        if (tdt && pulgadas > 40) {
            precio += precio*0.3 + 500;
        } else if (tdt) {
            precio += 500;
        } else if (pulgadas > 40){
            precio += precio*0.30;
        }
        
        return precio;
    }
}
