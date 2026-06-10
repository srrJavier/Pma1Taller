package org.javiersian.view;
import java.util.Scanner;
import org.javiersian.controllerMatematicas.MenuMatematicas;
import org.javiersian.controllerStringManipulation.MenuStringManipulation;
import org.javiersian.controllerLogico.MenuLogico;

public class MenuPrincipal {
    private Scanner scanner;
    private MenuMatematicas menuMatematicas;
    private MenuStringManipulation menuString;
    private MenuLogico menuLog;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
        menuMatematicas = new MenuMatematicas();
        menuString = new MenuStringManipulation();
        menuLog = new MenuLogico();
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
                case 2:
                    menuCadenas();
                    break;
                case 3:
                    menuLogico();
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
    private void menuCadenas() {
        int subOpcion = 0;
        do {
            System.out.println("\n--- MANIPULACIÓN DE CADENAS (11-20) ---");
            System.out.println("11. Concatenar Nombre");
            System.out.println("12. Contador de Longitud");
            System.out.println("13. Inversor de Texto");
            System.out.println("14. Detector de Vocales");
            System.out.println("15. Extractor de Iniciales");
            System.out.println("16. Mayusculas");
            System.out.println("17. Conversor Binario");
            System.out.println("18. Repetidor de palabras");
            System.out.println("19. Validar COntraseña");
            System.out.println("20. Generador de Email");
            System.out.print("Seleccione una opción: ");
            
            subOpcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (subOpcion) {
                case 11:
                    System.out.print("Nombre: "); String n = scanner.nextLine();
                    System.out.print("Apellido: "); String a = scanner.nextLine();
                    System.out.println("Resultado: " + menuString.concatenarNombre(n, a));
                    break;
                case 12:
                    System.out.print("Texto: "); String t = scanner.nextLine();
                    System.out.println("Longitud: " + menuString.contadorLongitud(t));
                    break;
                case 13:
                    System.out.print("Texto: "); String inv = scanner.nextLine();
                    System.out.println("Invertido: " + menuString.inversorTexto(inv));
                    break;
                case 14:
                    System.out.print("Carácter: "); char c = scanner.nextLine().charAt(0);
                    System.out.println("¿Es vocal?: " + (menuString.detectorVocales(c) ? "Sí" : "No"));
                    break;
                case 15:
                    System.out.print("Nombre completo: "); String nom = scanner.nextLine();
                        System.out.println("Iniciales: " + menuString.extractorIniciales(nom));
                    break;
                case 16:
                    System.out.print("Texto: "); String txt = scanner.nextLine();
                    System.out.println("En mayúsculas: " + menuString.normalizarMayusculas(txt));
                    break;
                case 17:
                    System.out.print("Ingrese '1' o '0': "); String bin = scanner.nextLine();
                    System.out.println("Estado: " + menuString.conversorBinario(bin));
                    break;
                case 18:
                    System.out.print("Palabra: "); String p = scanner.nextLine();
                    System.out.print("Veces: "); int num = scanner.nextInt();
                    System.out.println("Resultado: " + menuString.repetidorPalabras(p, num));
                    break;
                case 19:
                    System.out.print("Password: "); String pass = scanner.nextLine();
                    System.out.println("¿Es segura?: " + (menuString.validadorPassword(pass) ? "Sí" : "No"));
                    break;
                case 20:
                    System.out.print("Nombre: "); String nEmail = scanner.nextLine();
                    System.out.print("Apellido: "); String aEmail = scanner.nextLine();
                    System.out.print("Dominio: "); String dom = scanner.nextLine();
                    System.out.println("Email: " + menuString.generadorEmail(nEmail, aEmail, dom));
                    break;
                case 21:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (subOpcion != 21);
    }
    private void menuLogico() {
        int subOpcion = 0;
        do {
            System.out.println("\n--- LÓGICA Y BOOLEANOS (21-30) ---");
            System.out.println("21. Verificador de Edad");
            System.out.println("22. Número Par");
            System.out.println("23. Semaforo");
            System.out.println("24. Rango Numerico");
            System.out.println("25. Login Simple");
            System.out.println("26. Mayor de Dos");
            System.out.println("27. Año Bisiesto");
            System.out.println("28. Notas Academicas");
            System.out.println("29. Validar Triangulo");
            System.out.println("30. Comparador de Strings");
            System.out.print("Seleccione una opción: ");
            
            subOpcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (subOpcion) {
                case 21:
                    System.out.print("Edad: "); int e = scanner.nextInt();
                    System.out.println("Es mayor: " + (menuLog.verificadorEdad(e) ? "Sí" : "No"));
                    break;
                case 22:
                    System.out.print("Número: "); int n = scanner.nextInt();
                    System.out.println("¿Es par?: " + (menuLog.esPar(n) ? "Sí" : "No"));
                    break;
                case 23:
                    System.out.print("Color (Rojo/Amarillo/Verde): "); String c = scanner.nextLine();
                    System.out.println("Acción: " + menuLog.semaforo(c));
                    break;
                case 24:
                    System.out.print("Número: "); int num = scanner.nextInt();
                    System.out.print("Min: "); int min = scanner.nextInt();
                    System.out.print("Max: "); int max = scanner.nextInt();
                    System.out.println("¿En rango?: " + (menuLog.enRango(num, min, max) ? "Sí" : "No"));
                    break;
                case 25:
                    System.out.print("Usuario: "); String u = scanner.nextLine();
                    System.out.print("Password: "); String pass = scanner.nextLine();
                    System.out.println("Acceso: " + (menuLog.loginSimple(u, pass) ? "Autorizado" : "Denegado"));
                    break;
                case 26:
                    System.out.print("Num A: "); int a = scanner.nextInt();
                    System.out.print("Num B: "); int b = scanner.nextInt();
                    System.out.println("El mayor es: " + menuLog.mayorDeDos(a, b));
                    break;
                case 27:
                    System.out.print("Año: "); int yr = scanner.nextInt();
                    System.out.println("¿Bisiesto?: " + (menuLog.esBisiesto(yr) ? "Sí" : "No"));
                    break;
                case 28:
                    System.out.print("Nota: "); double nota = scanner.nextDouble();
                    System.out.println("Estado: " + menuLog.estadoAcademico(nota));
                    break;
                case 29:
                    System.out.print("Lado 1: "); double l1 = scanner.nextDouble();
                    System.out.print("Lado 2: "); double l2 = scanner.nextDouble();
                    System.out.print("Lado 3: "); double l3 = scanner.nextDouble();
                    System.out.println("¿Es triángulo?: " + (menuLog.esTriangulo(l1, l2, l3) ? "Sí" : "No"));
                    break;
                case 30:
                    System.out.print("Cadena 1: "); String s1 = scanner.nextLine();
                    System.out.print("Cadena 2: "); String s2 = scanner.nextLine();
                    System.out.println("¿Son iguales?: " + (menuLog.comparadorCadenas(s1, s2) ? "Sí" : "No"));
                    break;
                case 31:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (subOpcion != 31);
    }

}
     

 
  

