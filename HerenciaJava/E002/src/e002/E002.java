/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e002;

import Entidad.Interfaz;

/**
 *
 * @author Crisvall
 */
public class E002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz interf = new Interfaz() {
            @Override
            public void hi() {
                System.out.println("Hola");
            }
        };
        
        interf.hi();
    }
    
}
