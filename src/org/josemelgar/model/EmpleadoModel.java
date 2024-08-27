/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemelgar.model;

/**
 *
 * @author informatica
 */
public class EmpleadoModel {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    public EmpleadoModel(){
        
    }

    public EmpleadoModel(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + " edad=" + edad + "salario" + salario +  '}';
    }

}
