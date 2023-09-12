/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Crisvall
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
    siguiente:
 */
public class Animal {
    protected String name, raza, alimento;
    protected int edad;

    public Animal() {
    }

    public Animal(String name, String raza, String alimento, int edad) {
        this.name = name;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void alimentarse (){
        System.out.println("Soy la clase animal");
    }
}
