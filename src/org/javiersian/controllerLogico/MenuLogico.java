
package org.javiersian.controllerLogico;
public class MenuLogico {
    public boolean verificadorEdad(int edad) { return edad >= 18; }
    public boolean esPar(int numero) { return numero % 2 == 0; }
    public String semaforo(String color) {
        return switch (color.toLowerCase()) {
            case "rojo" -> "Detenerse";
            case "amarillo" -> "Precaución";
            case "verde" -> "Avanzar";
            default -> "Color no válido";
        };
    }
    public boolean enRango(int num, int min, int max) { return num >= min && num <= max; }
    public boolean loginSimple(String user, String pass) { 
        return user.equals("admin") && pass.equals("1234"); 
    }
    public int mayorDeDos(int a, int b) { return Math.max(a, b); }
    public boolean esBisiesto(int año) { 
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0); 
    }
    public String estadoAcademico(double nota) { return nota >= 60 ? "Aprobado" : "Reprobado"; }
}
