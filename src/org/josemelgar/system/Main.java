/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josemelgar.system;

import org.josemelgar.model.DesarrolladorModel;
import org.josemelgar.model.EmpleadoModel;
import org.josemelgar.model.TesterModel;

public class Main {
    public static void main(String[] args) {
        // Crear instancias directas
        DesarrolladorModel dev = new DesarrolladorModel("Java", "Juan", "Pérez", 30, 3000.0);
        DesarrolladorModel dev2 = new DesarrolladorModel("Python", "Ana", "Gómez", 28, 2800.0);
        TesterModel tester = new TesterModel("Automatización", "Luis", "Martínez", 32, 2900.0);
        
        // Usar los métodos
        dev.trabajar("Sistema de Gestión");    
        dev2.trabajar(8); 

        tester.trabajar("Selenium", "Proyecto Web"); 

        // Polimorfismo por sustitución
        EmpleadoModel empleado1 = new DesarrolladorModel("C++", "Carlos", "Sánchez", 35, 3500.0);
        EmpleadoModel empleado2 = new TesterModel("Manual", "Marta", "López", 29, 2700.0);
        
        // Llamadas a los métodos usando la referencia de tipo EmpleadoModel
        empleado1.trabajar(7); 
        
        empleado2.trabajar(6); 
        
        // Imprimir información
        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}
