/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Crisvall
    * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
   consumo energético (letras entre A y F) y peso.
   Los constructores que se deben implementar son los siguientes:
   • Un constructor vacío. --ok
   • Un constructor con todos los atributos pasados por parámetro. --ok
   Los métodos a implementar son:
   • Métodos getters y setters de todos los atributos. --ok
   • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
   sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
   objeto y no será visible.
   • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
   usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
   blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
   minúsculas. Este método se invocará al crear el objeto y no será visible.
 */
public class Electrodomestico {
    protected int precio, peso;
    protected String color;
    protected char consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, int peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }
    
    
    
    
    
    
}
