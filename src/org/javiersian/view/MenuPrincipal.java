
package org.javiersian.view;

import java.util.Scanner;
import org.javiersian.controllerMatematicas.MenuMatematicas;

public class MenuPrincipal {
    private Scanner scanner;
    private MenuMatematicas mate;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
        mate = new MenuMatematicas();
    }
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n=============================");
            System.out.println("---- SISTEMA SIPRO-LOG ----");
            System.out.println("=============================");
            System.out.println("1. Operaciones Matemáticas (1-10)");
            System.out.println("2. Manipulación de Cadenas (11-20)");
            System.out.println("3. Lógica y Booleanos (21-30)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuMatematicas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private void menuMatematicas() {
        int subOpcion = 0;
        do {
            System.out.println("\n--- CÁLCULO NUMÉRICO (1-10) ---");
            System.out.println("1. Calculadora de Salario");
            System.out.println("11. Regresar");
            System.out.print("Seleccione una operación: ");
            
            subOpcion = scanner.nextInt();
            scanner.nextLine();

            switch (subOpcion) {
                case 1:
                    System.out.print("Horas trabajadas: ");
                    double horas = scanner.nextDouble();
                    System.out.print("Pago por hora: ");
                    double pago = scanner.nextDouble();
                    System.out.println("Salario: " + mate.calcularSalario(horas, pago));
                    break;
                case 11:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (subOpcion != 11);
    }
}