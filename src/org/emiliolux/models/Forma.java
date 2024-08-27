package org.emiliolux.models;

abstract  class Forma {
    private String color;

    public Forma() {
    }

    public Forma(String color) {
        this.color = color;
    }
    
    
    
    public abstract double calcularArea();
    
    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return calcularArea();
    }

    public abstract double calcularArea(double ajuste);    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
