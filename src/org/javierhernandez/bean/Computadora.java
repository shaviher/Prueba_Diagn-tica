
package org.javierhernandez.bean;

/**
 *
 * @author javih
 */
public class Computadora extends Dispositivo {
    private String sistemaOperativo;
    
    public Computadora() {
        super(); //Super() llama los abributos de la clase padre 
    }

    public Computadora(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
     public Computadora(String marca, String modelo, int anio, String sistemaOperativo) {
        super(marca, modelo, anio); // Llama al constructor de la superclase
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
   
    // Implementación del método abstracto encender() de Dispositivo
    @Override 
    public void encender() {
        System.out.println("La Computadora se está encendiendo.");
    }
    
    // Sobrecarga del método encender() que acepta un String clave
    public void encender(String clave) {
        System.out.println("La Computadora se está encendiendo con la clave de desbloqueo: " + clave);
    }
    
    @Override
    // Implementación del método toString()
    public String toString() {
        //Super() llama los abributos de la clase padre y los junta con la clase hija 
        return super.toString() + ", Sistema Operativo=" + sistemaOperativo + '}';
    }
 
}