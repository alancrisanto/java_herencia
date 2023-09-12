/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e003;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Crisvall
 */
public class E003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1 = new Perro("Firu", "Pastor", "Carne", 15);
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "Chihuahua", "Croquetas", 8);
        perro2.alimentarse();
        Animal gato1 = new Gato("Peluza", "Siamés", "Atún", 10);
        gato1.alimentarse();
        Animal caballo = new Caballo("Spirit", "Fino", "Pasto", 25);
        caballo.alimentarse();
    }
    
}
