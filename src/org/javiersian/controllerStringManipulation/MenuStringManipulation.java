
package org.javiersian.controllerStringManipulation;

public class MenuStringManipulation {

    public String concatenarNombre(String nom, String ape) { return nom + " " + ape; }
    public int contadorLongitud(String texto) { return texto.length(); }
    public String inversorTexto(String texto) { return new StringBuilder(texto).reverse().toString(); }
}
