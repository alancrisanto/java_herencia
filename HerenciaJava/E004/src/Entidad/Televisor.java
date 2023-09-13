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
public class Televisor extends Electrodomestico{
    private int resolution;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolution, boolean tdt, int precio, int peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean getTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor = " +  peso + ", " + consumo + ", " + color + ", "  + resolution + ", " + tdt + " "   + precio ;
    }

}
