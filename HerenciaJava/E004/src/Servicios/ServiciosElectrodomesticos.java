/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
        precio se le da un valor base de $1000.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
        sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
        objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
        usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
        blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
        minúsculas. Este método se invocará al crear el objeto y no será visible.
 • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
        precio. Esta es la lista de precios:
        * LETRA     PRECIO
                A           $1000
                B           $800
                C           $600
                D           $500
                E           $300
                F           $100
         
         * PESO                         PRECIO
            Entre 1 y 19 kg           $100
            Entre 20 y 49 kg         $500
            Entre 50 y 79 kg         $800
            Mayor que 80 kg        $1000
* 
 */

public class ServiciosElectrodomesticos {
    
    Scanner sc = new Scanner(System.in);
    Electrodomestico el = new Electrodomestico();
    
    public Electrodomestico crearElectrodomestico(){
        
        System.out.println("Ingrese peso del producto");
        el.setPeso(sc.nextInt());
           sc.nextLine();
        
        System.out.println("Ingrese Consumo del producto");
         char letter = sc.nextLine().charAt(0);
         comprobarConsumo(letter);
        
        System.out.println("Ingrese color del producto");
        String color = sc.nextLine();
        comprobarColor(color);
        
        int precio = precioFinal();
        el.setPrecio(precio);
        
        return el;
    }
    
    public void comprobarConsumo (char let){
        List<Character> letras = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
        
        char letraEncontrada = 'F';
        
        for (char letra : letras) {
            if (letra == Character.toUpperCase(let)) {
                letraEncontrada = letra;
            }
        }
        el.setConsumo(letraEncontrada);
    }
    
    public void comprobarColor (String color){
         List<String> colors = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
        
        String colorEncontrado = "blanco";
        
        for (String col : colors) {
            if (color.equalsIgnoreCase(col) ) {
               colorEncontrado = color.toLowerCase();
                break;
            } 
        }
        
        el.setColor(colorEncontrado);
    }
    
    public int precioFinal(){
        
        int precio = 0;
        
        int peso = el.getPeso();
        char consumo = Character.toUpperCase(el.getConsumo()); 
        
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            default:
                precio += 100;
                break;
        }
        
        if (peso >0 && peso < 20) {
            precio += 100;
        } else if (peso < 50){
            precio += 500;
        } else if (peso < 80){
            precio += 800;
        } else {
            precio += 1000;
        }
        
        return precio;
       
    }
}
