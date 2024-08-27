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
public abstract class EmpleadoModel {
    
    private String nombre;
    private String apellido;
    private double edad;
    private double salario;
    
    public EmpleadoModel(){
        
    }

    public EmpleadoModel(String nombre, String apellido, double edad, double salario) {
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

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    abstract void trabajar();
    
    public void trabajar(int horas){
        System.out.println("el empleado trabajara durante" + horas + "horas");
    }
    
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + " edad=" + edad + "salario" + salario +'}';
    }

}
