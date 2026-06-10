package org.javiersian.controllerMatematicas;
import java.util.Scanner;
public class MenuMatematicas {
    private Scanner scanner;
    private MenuMatematicas mate;
{

    }
    public double calcularSalario(double horasTrabajadas, double pagoPorHora) {
        return horasTrabajadas * pagoPorHora;
    }
    public double areaTriangulo(double base, double altura) {
    return (base * altura) / 2.0;
}
    private void menuMatematicas() {
    int subOpcion = 0;
    do {
        System.out.println("\n=============================");
        System.out.println("--- CÁLCULO NUMÉRICO (1-10) ---");
        System.out.println("=============================");
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
                System.out.println("\n[1] Calculadora de Salario");
                System.out.print("Ingrese las horas trabajadas: ");
                double horas = scanner.nextDouble();
                System.out.print("Ingrese el pago por hora: ");
                double pago = scanner.nextDouble();
                
                double salarioTotal = mate.calcularSalario(horas, pago);
                System.out.println("El salario total es: Q" + salarioTotal);
                break;

            case 2:
                System.out.println("\n[2] Área de un Triángulo");
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                
                double area = mate.areaTriangulo(base, altura);
                System.out.println("El área del triángulo es: " + area);
                break;
            case 11:
                System.out.println("Regresando al menú principal...");
                break;

            default:
                System.out.println("Opción no válida para este módulo.");
        }
    } while (subOpcion != 11); 
 }
}