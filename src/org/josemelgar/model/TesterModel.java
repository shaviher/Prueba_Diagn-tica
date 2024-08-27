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
public class TesterModel extends EmpleadoModel {
    
    private String tipoPrueba;

    public TesterModel() {
    }

    public TesterModel(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public TesterModel(String tipoPrueba, String nombre, String apellido, double edad, double salario) {
        super(nombre, apellido, edad, salario);
        this.tipoPrueba = tipoPrueba;
    }

   
    
    @Override
    void trabajar(){
        System.out.println("el empleado trabaja en " + tipoPrueba + ".");
    }
    
    public void trabajar(String herramienta, String proyecto ){
        System.out.println("el empleado utilizarala herramienta"  + herramienta + " para el proyecto" + proyecto);
    } 

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    
     
}
