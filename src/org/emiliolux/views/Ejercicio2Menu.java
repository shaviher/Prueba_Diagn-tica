package org.emiliolux.views;

import org.emiliolux.models.Circulo;
import org.emiliolux.models.Cuadrado;
import org.emiliolux.models.Rectangulo;
import org.emiliolux.models.Triangulo;

import java.util.Scanner;

public class Ejercicio2Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu(String[] args) {
        int option;
        do {
            option = menuFiguras();
            escogerFigura(option);
        } while (option != 5);
    }
    
    //        Ejercicio2Menu.mostrarMenu(args);


    public static int menuFiguras() {
        System.out.println(" --------- Menú Principal ---------");
        System.out.println("1. Calcular área del Círculo");
        System.out.println("2. Calcular área del Triángulo");
        System.out.println("3. Calcular área del Cuadrado");
        System.out.println("4. Calcular área del Rectángulo");
        System.out.println("5. Salir");
        System.out.print(" ---------Seleccione una opción: --------- ");
        return scanner.nextInt();
        
    }

    public static void escogerFigura(int option) {
        switch (option) {
            case 1:
                areaCirculo();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areaCuadrado();
                break;
            case 4:
                areaRectangulo();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    public static void areaCirculo() {
        System.out.println("Ingrese el color del círculo:");
        String color = scanner.next();
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(color, radio);
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        regresarMenu();
    }

    public static void areaTriangulo() {
        System.out.println("Ingrese la base del triángulo:");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura del triángulo:");
        int altura = scanner.nextInt();
        System.out.println("Ingrese el color del triángulo:");
        String color = scanner.next();

        Triangulo triangulo = new Triangulo(base, altura, color);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());

        regresarMenu();
    }

    public static void areaCuadrado() {
        System.out.println("Ingrese la base del cuadrado:");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura del cuadrado:");
        int altura = scanner.nextInt();
        System.out.println("Ingrese el color del cuadrado:");
        String color = scanner.next();

        Cuadrado cuadrado = new Cuadrado(base, altura, color);
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());

        regresarMenu();
    }

    public static void areaRectangulo() {
        System.out.println("Ingrese el largo del rectángulo:");
        int largo = scanner.nextInt();
        System.out.println("Ingrese el ancho del rectángulo:");
        int ancho = scanner.nextInt();
        System.out.println("Ingrese el color del rectángulo:");
        String color = scanner.next();

        Rectangulo rectangulo = new Rectangulo(largo, ancho, color);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

        regresarMenu();
    }

    public static void regresarMenu() {
        System.out.println("Presione Enter para volver al menú principal...");
        scanner.nextLine(); 
        scanner.nextLine(); 
    }
}
