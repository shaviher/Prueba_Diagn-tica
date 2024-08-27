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

    public TesterModel(String tipoPrueba, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.tipoPrueba = tipoPrueba;
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
    
    
    
    
    
    
}
