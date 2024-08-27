package org.javierhernandez.bean;

/**
 * Clase que representa un Televisor, hereda de Dispositivo.
 */
public class Televisor extends Dispositivo {
    private int tamanoPantalla;

    // Constructor vacío
    public Televisor() {
        super();  //Super() llama los abributos de la clase padre 
    }

    // Constructor con todos los parámetros
    public Televisor(String marca, String modelo, int anio, int tamanoPantalla) {
        super(marca, modelo, anio); // Llama al constructor de la superclase
        this.tamanoPantalla = tamanoPantalla;
    }

    //Getter
    public int getTamanoPantalla() {
        return tamanoPantalla;
    }
    
    //Setter 
    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    // Implementación del método abstracto encender() de Dispositivo
    @Override
    public void encender() {
        System.out.println("El Televisor se está encendiendo.");
    }

    // Sobrecarga del método encender() que acepta un Int volumen
    public void encender(int volumen) {
        System.out.println("El Televisor se está encendiendo con el volumen ajustado a: " + volumen);
    }

    @Override
    // Implementación del método toString()
    public String toString() {
        //Super() llama los abributos de la clase padre y los junta con la clase hija 
        return super.toString() + ", Tamaño Pantalla=" + tamanoPantalla + " pulgadas" + '}';
    }
}

