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
public  class DesarrolladorModel extends EmpleadoModel {
    private String lenguajeDeProgramacion;
    
    public DesarrolladorModel(){
        
    }

    public DesarrolladorModel(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public DesarrolladorModel(String lenguajeDeProgramacion, String nombre, String apellido, double edad, double salario) {
        super(nombre, apellido, edad, salario);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

   
    
    @Override
    void trabajar(){
        System.out.println("el empleado utilizara el lenguaje de programacion"  + lenguajeDeProgramacion + " para el proyecto");
    }
    
     public void trabajar(String proyecto){
        System.out.println("el empleado utilizara el lenguaje de programacion"  + proyecto + " para el proyecto");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }
     
     
    
}
