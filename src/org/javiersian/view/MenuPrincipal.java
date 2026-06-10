
package org.javiersian.view;
import java.util.Scanner;

public class MenuPrincipal {
   private Scanner scanner;

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n============================¡");
            System.out.println("---- SISTEMA SIPRO-LOG ----");
            System.out.println("==============================");
            System.out.println("1. Operaciones Matemáticas (1-10)");
            System.out.println("2. Manipulación de Cadenas (11-20)");
            System.out.println("3. Lógica y Booleanos (21-30)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
        } while (opcion != 4);
    }
}