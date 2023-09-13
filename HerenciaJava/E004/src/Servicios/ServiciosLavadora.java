/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Crisvall
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
    además de los atributos heredados.
    Los constructores que se implementarán serán:
    • Un constructor vacío.
    • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
    llamar al constructor de la clase padre.
    Los métodos que se implementara serán:
    • Método get y set del atributo carga.
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
 */
public class ServiciosLavadora {
    
    Scanner sc = new Scanner(System.in);
    ServiciosElectrodomesticos servElc = new ServiciosElectrodomesticos();    
    Lavadora lavadora = new Lavadora();
    
    public Lavadora  crearLavadora () {
        
        Electrodomestico elect = servElc.crearElectrodomestico();
        lavadora.setPeso(elect.getPeso());
        lavadora.setConsumo(elect.getConsumo());
        lavadora.setColor(elect.getColor());
        lavadora.setPrecio(elect.getPrecio());
        
        System.out.println("Ingrese carga de la lavadora ");
        int carga = sc.nextInt();
        lavadora.setCarga(carga);
        
        int precio = precioFinal();
        lavadora.setPrecio(precio);
        
        return lavadora;
        
    }
    
    public int precioFinal(){
        int precio = servElc.precioFinal();
        int carga = lavadora.getCarga();
        
        if( carga > 30){
            precio += 500;
        }
        
        return precio;
        
    }
    
}
