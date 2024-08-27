
package org.javierhernandez.bean;

/**
 *
 * @author javih
 */
public abstract class Dispositivo {
    public int marca;
    public String modelo;
    public int anio;

    public Dispositivo() {
    }

    public Dispositivo(int marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

         // Método abstracto
    public abstract void encender();

    // Método sobrecargado
    public void encender(int voltaje) {
        System.out.println("Encendiendo el dispositivo con un voltaje de " + voltaje + "V.");
    }

    // Otro método no abstracto
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
    
    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }
}
