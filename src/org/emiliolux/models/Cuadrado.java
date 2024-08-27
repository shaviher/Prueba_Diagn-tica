package org.emiliolux.models;

public class Cuadrado extends Forma{
    private int base;
    private int altura;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;

    }
    
}
