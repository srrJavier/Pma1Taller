
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
}
