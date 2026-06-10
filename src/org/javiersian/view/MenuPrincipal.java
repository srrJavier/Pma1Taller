package org.javiersian.view;

import java.util.Scanner;
import org.javiersian.controllerMatematicas.MenuMatematicas;

public class MenuPrincipal {
    private Scanner scanner;
    private MenuMatematicas menuMatematicas;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
        menuMatematicas = new MenuMatematicas();
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
            System.out.println("2. Área de un Triángulo");
            System.out.println("3. Promedio Académico");
            System.out.println("4. Convertidor de Temperatura");
            System.out.println("5. Perímetro de Círculo");
            System.out.println("6. Volumen de un Cilindro");
            System.out.println("7. Hipotenusa");
            System.out.println("8. Días a Minutos");
            System.out.println("9. Resto de División");
            System.out.println("10. Potencia al Cubo");
            System.out.println("11. Regresar al Menú Principal");
            System.out.print("Seleccione una operación: ");
            
            subOpcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (subOpcion) {
                case 1:
                    System.out.print("Horas trabajadas: "); double horas = scanner.nextDouble();
                    System.out.print("Pago por hora: "); double pago = scanner.nextDouble();
                    System.out.println("Salario: " + menuMatematicas.calcularSalario(horas, pago));
                    break;
                case 2:
                    System.out.print("Base: "); double b = scanner.nextDouble();
                    System.out.print("Altura: "); double a = scanner.nextDouble();
                    System.out.println("Área: " + menuMatematicas.areaTriangulo(b, a));
                    break;
                case 3:
                    System.out.print("Nota 1: "); double n1 = scanner.nextDouble();
                    System.out.print("Nota 2: "); double n2 = scanner.nextDouble();
                    System.out.print("Nota 3: "); double n3 = scanner.nextDouble();
                    System.out.println("Promedio: " + menuMatematicas.promedioAcademico(n1, n2, n3));
                    break;
                case 4:
                    System.out.print("Grados Celsius: "); double c = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + menuMatematicas.convertidorTemperatura(c));
                    break;
                case 5:
                    System.out.print("Radio del círculo: "); double r = scanner.nextDouble();
                    System.out.println("Perímetro: " + menuMatematicas.perimetroCirculo(r));
                    break;
                case 6:
                    System.out.print("Radio: "); double rc = scanner.nextDouble();
                    System.out.print("Altura: "); double hc = scanner.nextDouble();
                    System.out.println("Volumen: " + menuMatematicas.volumenCilindro(rc, hc));
                    break;
                case 7:
                    System.out.print("Cateto A: "); double ca = scanner.nextDouble();
                    System.out.print("Cateto B: "); double cb = scanner.nextDouble();
                    System.out.println("Hipotenusa: " + menuMatematicas.calcularHipotenusa(ca, cb));
                    break;
                case 8:
                    System.out.print("Días: "); int d = scanner.nextInt();
                    System.out.println("Minutos: " + menuMatematicas.diasAMinutos(d));
                    break;
                case 9:
                    System.out.print("Dividendo: "); double div = scanner.nextDouble();
                    System.out.print("Divisor: "); double sor = scanner.nextDouble();
                    System.out.println("Residuo: " + menuMatematicas.restoDivision(div, sor));
                    break;
                case 10:
                    System.out.print("Número a elevar al cubo: "); int num = scanner.nextInt();
                    System.out.println("Resultado: " + menuMatematicas.potenciaAlCubo(num));
                    break;
                case 11:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (subOpcion != 11); 
    }
}
     

 
  

