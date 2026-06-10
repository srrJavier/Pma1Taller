
package org.javiersian.controllerStringManipulation;

public class MenuStringManipulation {

    public String concatenarNombre(String nom, String ape) { return nom + " " + ape; }
    public int contadorLongitud(String texto) { return texto.length(); }
    public String inversorTexto(String texto) { return new StringBuilder(texto).reverse().toString(); }
    public boolean detectorVocales(char c) { 
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
    }
    public String extractorIniciales(String nombreCompleto) {
        String[] partes = nombreCompleto.split(" ");
        String iniciales = "";
        for(String parte : partes) iniciales += parte.charAt(0);
        return iniciales.toUpperCase();
    }
    public String normalizarMayusculas(String texto) { return texto.toUpperCase(); }
    public String conversorBinario(String binario) {
        return binario.equals("1") ? "Encendido" : "Apagado";
    }
    public String repetidorPalabras(String palabra, int veces) { 
        return palabra.repeat(veces); 
    }
}
