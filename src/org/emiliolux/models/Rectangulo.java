
package org.emiliolux.models;


public class Rectangulo extends Forma {
    private int largo;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo(int largo, int ancho, String color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea()+ajuste;
    }
    
    
}
