import org.javierhernandez.view.DispositivosView;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DispositivosView dw = new DispositivosView();

        boolean flag = true;

        while (flag) {
            // Menú principal
            System.out.println("Menú Principal");
            System.out.println("1. Menú Dispositivos");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    dw.iniciar(); // Llama al menú de dispositivos
                    break;
                /*case 2:
                    opcion2(); // Llama a la opción 2
                    break;
                case 3:
                    opcion3(); // Llama a la opción 3
                    break;*/
                case 0:
                    System.out.println("Saliendo...");
                    flag = false; // Termina el bucle y sale del programa
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close(); // Cierra el scanner
    }
}

