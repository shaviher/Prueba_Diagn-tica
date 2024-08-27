package org.emiliolux.models;

public class Triangulo extends Forma {
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int base, int altura, String color) {
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
        return 0.5*base*altura;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea()+ ajuste;
    }
    
    
}
