/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e001;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Crisvall
 * 
 * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
 */
public class E001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal anima : animales) {
            anima.hacerRuido();
        }
    }
    
}
