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
public class DesarrolladorModel extends EmpleadoModel {
    public String lenguajeDeProgramacion;
    
    public DesarrolladorModel(){
        
    }

    public DesarrolladorModel(String lenguajeDeProgramacion, String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad, salario);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }
    
}
