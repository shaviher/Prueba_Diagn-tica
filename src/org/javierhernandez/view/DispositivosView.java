package org.javierhernandez.view;

import java.util.Scanner;
import org.javierhernandez.bean.Computadora;
import org.javierhernandez.bean.Telefono;
import org.javierhernandez.bean.Televisor;

/**
 *
 * @author javih
 */
public class DispositivosView {

    Scanner scanner = new Scanner(System.in);

    // Crear instancias de las clases
    Telefono telefono = new Telefono("Samsung", "Galaxy S21", 2021, "Smartphone");
    Computadora computadora = new Computadora("Dell", "XPS 13", 2022, "Windows 11");
    Televisor televisor = new Televisor("Sony", "Bravia", 2023, 55);

    public void iniciar() {
        Boolean flag = true;

        while (flag == true) {
            // Mostrar menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Encender Teléfono");
            System.out.println("2. Encender Computadora");
            System.out.println("3. Encender Televisor");
            System.out.println("4. Mostrar Información del Teléfono");
            System.out.println("5. Mostrar Información de la Computadora");
            System.out.println("6. Mostrar Información del Televisor");
            System.out.println("7. Regresar a menu General");
            System.out.println("0. Salir");

            // Leer opción del usuario
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    telefono.encender(); // Llama al método encender() del objeto telefono.
                    System.out.print("Ingrese código de desbloqueo: ");
                    String codigo = scanner.nextLine();
                    telefono.encender(codigo);
                    break;
                case 2:
                    computadora.encender(); // Llama al método encender() del objeto computadora .
                    System.out.print("Ingrese clave de usuario: ");
                    String clave = scanner.nextLine();
                    computadora.encender(clave);
                    break;
                case 3:
                    televisor.encender(); // Llama al método encender() del objeto televisor.
                    System.out.print("Ingrese volumen para ajustar: ");
                    int volumen = scanner.nextInt();
                    televisor.encender(volumen);
                    break;
                case 4:
                    System.out.println(telefono);
                    break;
                case 5:
                    System.out.println(computadora);
                    break;
                case 6:
                    System.out.println(televisor);
                    break;
                case 7:
                    System.out.println("Volviendo al menú principal...");
                    return;
                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0); // Salir completamente del programa
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}
