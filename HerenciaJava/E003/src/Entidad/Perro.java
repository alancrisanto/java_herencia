/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Crisvall
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String name, String raza, String alimento, int edad) {
        super(name, raza, alimento, edad);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Soy " + getName() + " y me alimento de " + getAlimento());
    }
}
