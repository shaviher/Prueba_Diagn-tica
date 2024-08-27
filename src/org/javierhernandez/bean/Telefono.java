package org.javierhernandez.bean;

// Asegúrate de que la clase extiende Dispositivo
public class Telefono extends Dispositivo {
    private String tipo;

    // Constructor sin parámetros
    public Telefono() {
        super();  //Super() llama los abributos de la clase padre 
    }

    public Telefono(String tipo) {
        this.tipo = tipo;
    }

    // Constructor con parámetros
    public Telefono(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio); // Inicializa los atributos heredados
        this.tipo = tipo;
    }

    // Getter y setter para el atributo tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Implementación del método abstracto encender() de Dispositivo
    @Override
    public void encender() {
        System.out.println("El teléfono se está encendiendo.");
    }

    // Sobrecarga del método encender() que acepta un String codigo
    public void encender(String codigo) {
        System.out.println("El teléfono se está encendiendo con el código de desbloqueo: " + codigo);
    }

    // Implementación del método toString()
    @Override
    public String toString() {
        //Super() llama los abributos de la clase padre y los junta con la clase hija 
        return super.toString() + ", Tipo=" + tipo + '}';
    }
}
